package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity  //Configura a classe java para que seja equivalente a uma tabela do Banco relacional.
	@Table (name = "tb_game") //Cria o nome da tabela
public class Game {
		
	@Id	//Chave primaria do Banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Forma que vai indicar par o Banco de como vai gerar o id.
	private Long id;
	private String title;
	
	@Column(name = "game_year") // Customizando o nome no Banco para game_year.
	private Integer year;
	private String genre;
	private String platforms;
	private String score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT") //Aceita mais caracteres que o VAR CHAR 255 no Banco.
	private String shortDescription;
	
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	public Game() {
	
	}
	
	public Game(Long id, String title, Integer year, String genre, String platforms, String score, String imgUrl,
			String shortDescription, String longDescription) {		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	//hashCode faz a comparação se tem game repetidos usando o id

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
