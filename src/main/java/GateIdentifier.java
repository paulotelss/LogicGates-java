import java.util.Arrays;

public class GateIdentifier {
    private LogicGate[] gates;
    private String[] gateNames;
    
    public GateIdentifier() {
        gates = new LogicGate[]{new ANDGate(), new ORGate(), new XORGate(), new NANDGate(), new NORGate(), new XNORGate()};
        gateNames = new String[]{"AND", "OR", "XOR", "NAND", "NOR", "XNOR"};
    }
    
    public String identifyGate(boolean[] A, boolean[] B, boolean[] Y) {
        for (int i = 0; i < gates.length; i++) {
            if (Arrays.equals(gates[i].operate(A, B), Y)) {
                return gateNames[i];
            }
        }
        return "Nenhuma porta corresponde";
    }
}
