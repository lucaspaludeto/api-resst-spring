package com.br.dio.api.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PrevisaoTempoResponseModel {

    private Integer hora;
    private Integer temperatura;
    private String data;
    private String nomeCidade;

    public List<Forecast> forecast = null;
}
