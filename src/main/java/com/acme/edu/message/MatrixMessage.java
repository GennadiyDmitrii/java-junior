package com.acme.edu.message;

public class MatrixMessage extends Message {

    private static final String PREFIX = "primitives matrix: ";

    public MatrixMessage(int[][] message) {
        super(message);
    }

    @Override
    public String getPrefics() {
        return PREFIX;
    }

    @Override
    protected String getMessage() {
        int[][] message = (int[][]) this.message;
        StringBuilder sb = new StringBuilder();
        sb.append("{\r\n");
        for (int[] aMessage : message) {
            sb.append("{");
            parseMatrixRow(aMessage, sb);
        }
        sb.append("}");
        return sb.toString();
    }

    private void parseMatrixRow(int[] ints, StringBuilder sb) {
        for (int j = 0; j < ints.length; j++) {
            if (j == (ints.length - 1)) {
                sb.append(ints[j]);
                sb.append("}\r\n");
            } else {
                sb.append(ints[j] + ", ");
            }
        }
    }
}
