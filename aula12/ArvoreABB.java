public class ArvoreABB {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public boolean add(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            root = newNode;
            return true;
        }

        Node aux = root;

        while (aux != null) {
            Node previous = aux;

            if(aux.getData() == value) {
                return false;
            }

            if(aux.getData() > value) {
                aux = aux.getLeft();
                if(aux == null) {
                    previous.setLeft(newNode);
                }
            } else {
                aux = aux.getRigth();
                if(aux == null) {
                    previous.setRigth(newNode);
                }
            }
        }
        return true;
    }

    public boolean exists(int value) {
        return true;
    }

    public String inOrder() {
        return inOrder(root);
    }

    private String inOrder(Node no) {
        if (no == null) return "";

        String out = "";
        
        out += inOrder(no.getLeft());
        out += no.getData() + " ";
        out += inOrder(no.getRigth());
        
        return out;
    }
}
