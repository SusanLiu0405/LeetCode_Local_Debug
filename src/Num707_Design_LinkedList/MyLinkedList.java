package Num707_Design_LinkedList;

class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        ListNode current = head;
        if (index < 0 || index >= size) {
            return -1;
        }

        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        // 如果index大于size 返回空
        if (index > size) {
            return;
        }

        // 如果index小于0 说明是头插
        if (index < 0) {
            index = 0;
        }

        // 首先size加一
        size++;

        // 找到需要插入的index。让prev指针往前一步一步走，在需要插入的元素的前面停下来。
        ListNode prev = head;
        // 新建一个流浪的Node
        ListNode outsider = new ListNode(val);
        if (index == size) {
            prev.next = outsider;
            return;
        } else {
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            outsider.next = prev.next;
            prev.next = outsider;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode neptunePrev = head;
        // 先判断index是否在合法范围内
        if (index < 0 || index >= size) {
            return;
        }

        // 首先size减一
        size--;

        for(int i = 0; i < index; i++) {
            neptunePrev.next = neptunePrev.next.next;
        }

    }
}
