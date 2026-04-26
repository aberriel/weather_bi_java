package br.com.anselmoti.weatherbi.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public class PageableModel {
    @Schema(title = "Número da página")
    private int page;
    public int getPage() { return this.page; }
    public void setPage(int page) { this.page = page; }

    @Schema(title = "Quantidade de elementos por página")
    private int size;
    public int getSize() { return this.size; }
    public void setSize(int size) { this.size = size; }
}