class Node {
    int Data;
    Node next;

    public Node(int data) {
        this.Data = data;
        this.next = null;
    }
}

public class MojaLista {
    Node head;

    void dodaj(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void wypisz() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void scalListy(MojaLista list1, MojaLista list2) {
        MojaLista scalonaLista = new MojaLista();
        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while(temp1 != null) {
            if (temp1.Data <= temp2.Data) {
                scalonaLista.dodaj(temp1.Data);
                scalonaLista.dodaj(temp2.Data);
            } else {
                scalonaLista.dodaj(temp2.Data);
                scalonaLista.dodaj(temp1.Data);
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        scalonaLista.wypisz();
    }
}



void main() {

    MojaLista lista1 = new MojaLista();
    lista1.dodaj(1);
    lista1.dodaj(2);
    lista1.dodaj(4);

    MojaLista lista2 = new MojaLista();
    lista2.dodaj(1);
    lista2.dodaj(3);
    lista2.dodaj(4);


    lista1.wypisz();
    lista2.wypisz();


    MojaLista lista3 = new MojaLista();
    lista3.scalListy(lista1,lista2);
}


