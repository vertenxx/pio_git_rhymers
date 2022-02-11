package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public static final int FAIL = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return FAIL;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return FAIL;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

/**
 * Klasa zawiera elementy listy dwukierunkowej
 */
class Node {

	private int value;
	private Node prev;
	private Node next;

	/**
	 * Ustawienie początkowej wartości noda
	 *
	 * @param i
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * Pobranie wartości noda
	 *
	 * @return value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Pobranie następnego noda
	 *
	 * @return next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Ustawienie wartosci nastepnego ndoa
	 *
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Pobranie poprzedniego noda
	 *
	 * @return
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Ustawienie wartosci poprzedniego noda
	 *
	 * @param prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
