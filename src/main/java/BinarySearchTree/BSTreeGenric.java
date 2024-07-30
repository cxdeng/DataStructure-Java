package BinarySearchTree;

public class BSTreeGenric<K extends Comparable<K>, V> {

    static class BSTNode<K, V> {
        K key;
        V value;

        BSTNode<K, V> left;
        BSTNode<K, V> right;

        public BSTNode(K key) {
            this.key = key;
        }

        public BSTNode(K key, V value, BSTNode<K, V> left, BSTNode<K, V> right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


    BSTNode<K, V> root;

    public V getRecur(K key) {
        return doGet(this.root, key);
    }


    public V getNonRecur(K key) {
        BSTNode<K, V> node = this.root;
        while (node != null) {
            if (key.compareTo(node.key) < 0) {
                node = node.left;
            } else if (key.compareTo(node.key) > 0) {
                node = node.right;
            } else {
                return node.value;
            }
        }

        return null;

    }


    private V doGet(BSTNode<K, V> node, K key) {
        if (node == null || key == null) return null;

        if (key.compareTo(node.key) < 0) {
            return doGet(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            return doGet(node.right, key);
        } else {
            return node.value;
        }
    }


    public V min() {
        return null;
    }


    public V max() {
        return null;
    }


    public void put(K key, V value) {

    }


    public V successor(K key) {
        return null;
    }


    public V predecessor(K key) {
        return null;
    }


    public V delete(K key) {
        return null;
    }
}
