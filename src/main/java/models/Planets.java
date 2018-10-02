package com.br.pmoraes.teste-b2w-stw;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Planets{
	@Id
	public ObjectId _id;
	
	public String clima;
	public String diametro;
	public String gravidade;
	public String nome;
	public String periododeOrbita;
	public String populacao;
	public List<String> residentes;
	public String rotacoesporPeriodo;
	public String aguanaSuperficie;
	public String terreno;
	public String url;
	
	public planets() {}
	
	public planets(String clima, String diametro, String gravidade, String nome,
			       String periododeOrbita, String populacao, List<String> residentes,
			       String rotacoesporPeriodo, String aguanaSuperficie, String terreno,
			       String url) {
		this.clima 			 	 = clima;
		this.diametro 		 	 = diametro;
		this.gravidade 		 	 = gravidade;
		this.nome 			 	 = nome;
		this.periododeOrbita 	 = periododeOrbita;
		this.populacao 		 	 = populacao;
		this.residentes		 	 = residentes;
		this.rotacoesporPeriodo	 = rotacoesPorPeriodo;
		this.aguanaSuperficie 	 = aguanaSuperficie;
		this.terreno 		 	 = terreno;
	}
	
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
	public getDiametro() {
		return diametro;
	}
	public setDiametro(String diametro) {
		this.diametro = diametro;
	}
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
	public getClima() {
		return clima;
	}
	public setClima(String clima) {
		this.clima = clima;
	}
}
