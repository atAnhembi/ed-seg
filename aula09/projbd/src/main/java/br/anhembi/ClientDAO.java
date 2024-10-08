package br.anhembi;

import java.util.List;

public interface ClientDAO {
    Client create(Client client);
    Client findById(int id);
    List<Client> findAll();
    boolean deleteById(int id);
}
