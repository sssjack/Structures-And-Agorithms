package Algorithms.sparseArray;

public class SparseArrayDto {
    /**
     * ������
     */
    private int Row;
    /**
     * ������
     */
    private int Column;
    /**
     * ���ݱ���
     */
    private int Data;
    /**
     * ��һ������
     */
    private SparseArrayDto next;



    public int getRow() {
        return Row;
    }

    public void setRow(int row) {
        Row = row;
    }

    public int getColumn() {
        return Column;
    }

    public void setColumn(int column) {
        Column = column;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public SparseArrayDto getNext() {
        return next;
    }

    public void setNext(SparseArrayDto next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SparseArrayDto{" +
                "Row=" + Row +
                ", List=" + Column +
                ", Data=" + Data +
                ", next=" + next +
                '}';
    }





}
