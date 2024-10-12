package br.com.view;

import lombok.Value;

public interface ProdutoFullViews {
    String getNome();
    Long getId();
    String getValor();

    @Value("#{target.valor * 2}")
    String valorComImposto;
}
