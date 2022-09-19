package Algorithms.sparseArray;

public class SparseArrayDto {
    /**
     * 行数据
     */
    private int Row;
    /**
     * 列数据
     */
    private int Column;
    /**
     * 数据本身
     */
    private int Data;
    /**
     * 下一个数据
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
