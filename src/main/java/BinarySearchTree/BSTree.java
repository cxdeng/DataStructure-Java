package BinarySearchTree;

import LeetCode.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BSTree {

    static class BSTNode {
        int key;
        Object value;

        BSTNode left;
        BSTNode right;

        public BSTNode(int key) {
            this.key = key;
        }

        public BSTNode(int key, Object value, BSTNode left, BSTNode right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


    BSTNode root;

    public Object getRecur(int key) {
        return doGet(this.root, key);
    }


    public Object getNonRecur(int key) {
        BSTNode node = this.root;
        while (node != null) {
            if (key < node.key) {
                node = node.left;
            } else if (key > node.key) {
                node = node.right;
            } else {
                return node.value;
            }
        }

        return null;

    }


    private Object doGet(BSTNode node, int key) {
        if (node == null) return null;

        if (key < node.key) {
            return doGet(node.left, key);
        } else if (key > node.key) {
            return doGet(node.right, key);
        } else {
            return node.value;
        }
    }


    public Object minRecur() {
        BSTNode node = this.root;
        return doMin(node);
    }

    private Object doMin(BSTNode node) {
        if (node == null) return null;

        if (node.left == null) {
            return node.value;
        }

        return doMin(node.left);
    }


    public Object maxRecur() {
        BSTNode node = this.root;
        return doMax(node);
    }

    private Object doMax(BSTNode node) {
        if (node == null) return null;

        if (node.right == null) {
            return node.value;
        }

        return doMax(node.right);
    }


    public Object minNonRecur() {
        if (this.root == null) return null;

        BSTNode node = this.root;
        while (node.left != null) {
            node = node.left;
        }

        return node.value;
    }


    public Object maxNonRecur() {
        if (this.root == null) return null;

        BSTNode node = this.root;
        while (node.right != null) {
            node = node.right;
        }

        return node.value;
    }


    public void put(int key, Object value) {
        BSTNode p = this.root;
        BSTNode prev = null;
        while (p != null) {
            prev = p;
            if (key < p.key) {
                p = p.left;
            } else if (key > p.key) {
                p = p.right;
            } else {
                p.value = value;
                return;
            }
        }


        BSTNode newNode = new BSTNode(key, value, null, null);
        if (prev == null) {
            this.root = newNode;
        } else if (key < prev.key) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
    }


    public Object predecessor(int key) {
        BSTNode p = this.root;
        BSTNode ancestorFromLeft = null;

        while (p != null) {
            if (key < p.key) {
                p = p.left;
            } else if (key > p.key) {
                ancestorFromLeft = p;
                p = p.right;
            } else {
                break;
            }
        }

        // Not Found
        if (p == null) return null;

        // Founded 1
        BSTNode p1 = p.left;
        if (p.left != null) {
            while (p1.right != null) {
                p1 = p1.right;
            }
            return p1.value;
        }


        // Founded 2
        return ancestorFromLeft != null ? ancestorFromLeft.value : null;
    }


    public Object successor(int key) {
        BSTNode p = this.root;
        BSTNode ancestorFromRight = null;

        while (p != null) {
            if (key < p.key) {
                ancestorFromRight = p;
                p = p.left;
            } else if (key > p.key) {
                p = p.right;
            } else {
                break;
            }
        }

        // Not Found
        if (p == null) return null;

        // Founded 1
        BSTNode p1 = p.right;
        if (p.right != null) {
            while (p1.left != null) {
                p1 = p1.left;
            }
            return p1.value;
        }


        // Founded 2
        return ancestorFromRight != null ? ancestorFromRight.value : null;
    }


    public Object deleteNonRecur(int key) {
        BSTNode p = this.root;
        BSTNode prev = null;

        while (p != null) {
            if (key < p.key) {
                prev = p;
                p = p.left;
            } else if (key > p.key) {
                prev = p;
                p = p.right;
            } else {
                break;
            }
        }

        if (p == null) return null;

        // Del operation
        if (p.left == null) {
            shift(prev, p, p.right);
        } else if (p.right == null) {
            shift(prev, p, p.left);
        } else {
            // Find the successor node of the deleted node
            BSTNode successor = p.right;
            BSTNode successorPrev = p;
            while (successor.left != null) {
                successorPrev = successor;
                successor = successor.left;
            }

            // Deal with the specific node
            if (successorPrev != p) {
                // Not adjacent
                shift(successorPrev, successor, successor.right);
                successor.right = p.right;
            }

            // The successor node takes place the deleted node
            shift(prev, p, successor);
            successor.left = p.left;
        }


        return p.value;
    }


    /**
     * @param prev        The parent node of the deleted node
     * @param deletedNode The node to be deleted
     * @param childNode   The child node of the deleted node
     */
    private void shift(BSTNode prev, BSTNode deletedNode, BSTNode childNode) {
        if (prev == null) {
            this.root = childNode;
        } else if (prev.right == deletedNode) {
            prev.right = childNode;
        } else {
            prev.left = childNode;
        }
    }


    public void deleteRecur(int key) {
        this.root = doDelete(this.root, key);
    }


    private BSTNode doDelete(BSTNode node, int key) {
        if (node == null) return null;

        if (key < node.key) {
            node.left = doDelete(node.left, key);
            return node;
        }

        if (key > node.key) {
            node.right = doDelete(node.right, key);
            return node;
        }

        if (node.left == null) {
            return node.right;
        }

        if (node.right == null) {
            return node.left;
        }

        BSTNode successor = node.right;
        while (successor.left != null) {
            successor = successor.left;
        }

        successor.right = doDelete(node.right, successor.key);
        successor.left = node.left;

        return successor;
    }


    public List<Object> less(int key) {
        List<Object> res = new ArrayList<>();
        BSTNode p = this.root;
        LinkedList<BSTNode> stack = new LinkedList<>();

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                BSTNode popNode = stack.pop();
                if (popNode.key < key) {
                    res.add(popNode.value);
                } else {
                    break;
                }
                p = popNode.right;
            }
        }
        return res;
    }


    public List<Object> greater(int key) {
        List<Object> res = new ArrayList<>();
        BSTNode p = this.root;
        LinkedList<BSTNode> stack = new LinkedList<>();

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                BSTNode popNode = stack.pop();
                if (popNode.key > key) {
                    res.add(popNode.value);
                }
                p = popNode.right;
            }
        }

        return res;
    }

    public List<Object> greaterAlternative(int key) {
        List<Object> res = new ArrayList<>();
        BSTNode p = this.root;
        LinkedList<BSTNode> stack = new LinkedList<>();

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.right;
            } else {
                BSTNode popNode = stack.pop();
                if (popNode.key > key) {
                    res.add(popNode.value);
                } else {
                    break;
                }
                p = popNode.left;
            }
        }

        return res;
    }


    public List<Object> between(int key1, int key2) {
        List<Object> res = new ArrayList<>();
        BSTNode p = this.root;
        LinkedList<BSTNode> stack = new LinkedList<>();

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                BSTNode popNode = stack.pop();
                if (popNode.key > key1 && popNode.key < key2) {
                    res.add(popNode.value);
                } else if (popNode.key > key2) {
                    break;
                }
                p = popNode.right;
            }
        }

        return res;
    }
}
