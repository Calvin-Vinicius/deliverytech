package com.deliverytech.delivery_api.model;

import jakarta.persistence.Entity;
import jakarta.persistenc.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column (inique = true, nullable = false)
    private String email;

    private String telefone;

    private String endereco;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro

    private boolean ativo;
    
    @OneToMany(mappedBy = "clientes")
    private list<Pedido> pedidos = new ArrayList<>();

}