package br.com.lima.k8s;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SaudacaoVO {

    private final long id;
    private final String conteudo;

}
