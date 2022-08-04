package baitap.BinarySearchTree;

public interface Tree<E> {

    boolean insert(E e);

    void inorder();
    void preorder();
    void postorder();

    boolean search(E e);

    boolean delete(E e);

    int getSize();
}