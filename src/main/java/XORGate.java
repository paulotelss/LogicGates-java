public class XORGate implements LogicGate {
    @Override
    public boolean[] operate(boolean[] A, boolean[] B) {
        boolean[] result = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] ^ B[i];
        }
        return result;
    }
}
