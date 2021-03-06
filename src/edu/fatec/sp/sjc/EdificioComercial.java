package edu.fatec.sp.sjc;

public class EdificioComercial extends Imovel {
	
	private Double areaEdificio;
	private Double custoCondominio;
	
	public Double getAreaEdificio() {
		return areaEdificio;
	}
	public void setAreaEdificio(Double areaEdificio) {
		this.areaEdificio = areaEdificio;
	}
	public Double getCustoCondominio() {
		return custoCondominio;
	}
	public void setCustoCondominio(Double custoCondominio) {
		this.custoCondominio = custoCondominio;
	}
	
	public EdificioComercial(String idLeilao, String idProduto, Double precoProduto, String endImov, String ufImov,
			String cidImov, String descricaoImov, Double areaEdificio, Double custoCondominio) {
		super(idLeilao, idProduto, precoProduto, endImov, ufImov, cidImov, descricaoImov);
		this.areaEdificio = areaEdificio;
		this.custoCondominio = custoCondominio;
	}

}
