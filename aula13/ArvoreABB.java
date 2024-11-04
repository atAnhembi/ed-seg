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

    // Exercícios
    
    public String preOrder() {
        return preOrder(root);
    }

    private String preOrder(Node no) {
        if (no == null) return "";

        String out = "";
        
        out += no.getData() + " ";
        out += preOrder(no.getLeft());
        out += preOrder(no.getRigth());
        
        return out;
    }

    public String posOrder() {
        return posOrder(root);
    }

    private String posOrder(Node no) {
        if (no == null) return "";

        String out = "";
        
        out += posOrder(no.getLeft());
        out += posOrder(no.getRigth());
        out += no.getData() + " ";
        
        return out;
    }

    public boolean existis(int key) {
        if (isEmpty()) {
            return false;
        }

        Node aux = root;

        while (aux != null) {
            if(aux.getData() == key) {
                return true;
            }

            if(aux.getData() > key) {
                aux = aux.getLeft();
            } else {
                aux = aux.getRigth();
            }
        }
        return false;
    }

    public int find(int key) {
        return 0;
    }
}

