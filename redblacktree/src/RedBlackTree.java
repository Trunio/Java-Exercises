class Node {
        int data;
        Node parent;
        Node left;
        Node right;
        int color;
    }

    public class RedBlackTree {
        private Node root;
        private Node TNULL;

        public RedBlackTree() {
            TNULL = new Node();
            TNULL.color = 0;
            TNULL.left = null;
            TNULL.right = null;
            root = TNULL;
        }

        public void leftRotate(Node x) {
            Node y = x.right;
            x.right = y.left;
            if (y.left != TNULL) {
                y.left.parent = x;
            }
            y.parent = x.parent;
            if (x.parent == null) {
                this.root = y;
            } else if (x == x.parent.left) {
                x.parent.left = y;
            } else {
                x.parent.right = y;
            }
            y.left = x;
            x.parent = y;
        }

        public void rightRotate(Node x) {
            Node y = x.left;
            x.left = y.right;
            if (y.right != TNULL) {
                y.right.parent = x;
            }
            y.parent = x.parent;
            if (x.parent == null) {
                this.root = y;
            } else if (x == x.parent.right) {
                x.parent.right = y;
            } else {
                x.parent.left = y;
            }
            y.right = x;
            x.parent = y;
        }

        public void insert(int key) {
            Node node = new Node();
            node.parent = null;
            node.data = key;
            node.left = TNULL;
            node.right = TNULL;
            node.color = 1;
            Node y = null;
            Node x = this.root;
            while (x != TNULL) {
                y = x;
                if (node.data < x.data) {
                    x = x.left;
                } else {
                    x = x.right;
                }
            }
            node.parent = y;
            if (y == null) {
                root = node;
            } else if (node.data < y.data) {
                y.left = node;
            } else {
                y.right = node;
            }

            if (node.parent == null) {
                node.color = 0;
                return;
            }
            if (node.parent.parent == null) {
                return;
            }

            fixInsert(node);
        }

        private void fixInsert(Node k) {
            Node u;
            while (k.parent.color == 1) {
                //case1
                if (k.parent == k.parent.parent.right) {
                    u = k.parent.parent.left;
                    if (u.color == 1) {
                        u.color = 0;
                        k.parent.color = 0;
                        k.parent.parent.color = 1;
                        k = k.parent.parent;
                    } else {
                        //case2
                        if (k == k.parent.left) {
                            k = k.parent;
                            rightRotate(k);
                        }
                        k.parent.color = 0;
                        k.parent.parent.color = 1;
                        leftRotate(k.parent.parent);
                    }
                    //case3
                } else {
                    u = k.parent.parent.right;
                    if (u.color == 1) {
                        u.color = 0;
                        k.parent.color = 0;
                        k.parent.parent.color = 1;
                        k = k.parent.parent;
                    } else {
                        if (k == k.parent.right) {
                            k = k.parent;
                            leftRotate(k);
                        }
                        k.parent.color = 0;
                        k.parent.parent.color = 1;
                        rightRotate(k.parent.parent);
                    }
                }
                if (k == root) {
                    break;
                }
            }
            root.color = 0;
        }

        private void printHelper(Node root, String indent, boolean last) {
            if (root != TNULL) {
                System.out.print(indent);
                if (last) {
                    System.out.print("R----");
                    indent += "   ";
                } else {
                    System.out.print("L----");
                    indent += "|  ";
                }

                if(root.color==0){
                    System.out.println(root.data+"(Black)");
                }
                if(root.color==1){
                    System.out.println(root.data+"(Red)");
                }
                printHelper(root.left, indent, false);
                printHelper(root.right, indent, true);
            }
        }

        public void Print() {
            printHelper(this.root, "", true);
        }
        public void PrintMaxDepth(){
            System.out.println("Max depth: " + (maxDepth(this.root)-1));

        }
        public void PrintMinDepth(){
            System.out.println("Min depth: " + (minimumDepth()-1));

        }
        public void PrintRed(){
            System.out.println("Red: " + countRed(this.root));

        }
        int minimumDepth()
        {
            return minimumDepth(root);
        }

        /* Function to calculate the minimum depth of the tree */
        int minimumDepth(Node root)
        {
            // Corner case. Should never be hit unless the code is
            // called on root = NULL
            if (root == null)
                return 0;

            // Base case : Leaf Node. This accounts for height = 1.
            if (root.left == null && root.right == null)
                return 1;

            // If left subtree is NULL, recur for right subtree
            if (root.left == null)
                return minimumDepth(root.right) + 1;

            // If right subtree is NULL, recur for left subtree
            if (root.right == null)
                return minimumDepth(root.left) + 1;

            return Math.min(minimumDepth(root.left),
                    minimumDepth(root.right)) + 1;
        }

        int maxDepth(Node node) {
            if (node == null)
                return 0;
            else {
                /* compute the depth of each subtree */
                int lDepth = maxDepth(node.left);
                int rDepth = maxDepth(node.right);
                /* use the larger one */
                if (lDepth > rDepth)
                    return (lDepth + 1);
                else
                    return (rDepth + 1);
            }
        }

        public static int countRed(Node node) {
            int nbRed = 0;
            if (node == null) {
                return 0;
            }
            nbRed += countRed(node.left);
            nbRed += countRed(node.right);

            if(node.color==1){
                nbRed++;
            }
            return nbRed;
        }

            public static void main(String[] args) {
            RedBlackTree bst = new RedBlackTree();
            /*
            bst.insert(33);
            bst.insert(13);
            bst.insert(53);
            bst.insert(100);
            bst.insert(10);
            bst.insert(14);
            bst.insert(6);
            bst.insert(3);
            */

             for(int i=1; i<=2000; i++){
                 bst.insert(i);
             }
            bst.Print();
           bst.PrintMaxDepth();
           bst.PrintMinDepth();
           bst.PrintRed();
        }
    }
