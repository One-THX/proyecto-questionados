package ar.com.questionados.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.AccessType.Type;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "preguntas")
public class Pregunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpreguntas;
	
	private String enunciado;

	private int idcategoria;
	 
    //@ManyToOne
   // @JoinColumn(name="idcategoria", referencedColumnName = "idcategorias")
   //private Categoria categoria;
	
	
	/*@OneToMany(mappedBy ="pregunta",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Respuesta> respuestas;*/
	

	
	
	
	
	

	/*public Set<Respuesta> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(Set<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}*/
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public Long getIdpreguntas() {
		return idpreguntas;
	}
	public void setIdpreguntas(Long idpreguntas) {
		this.idpreguntas = idpreguntas;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	
	

	

}
