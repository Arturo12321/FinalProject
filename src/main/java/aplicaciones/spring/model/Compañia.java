package aplicaciones.spring.model;



import com.sun.istack.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name="COMPAÑIAS")
public class Compañia {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@NotNull
		private String nombre;
		@NotNull
		private String direccion;
		@NotNull
		private Integer telefono;
		@NotNull
		private String ruc;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public Integer getTelefono() {
			return telefono;
		}
		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
		
		public String getRuc() {
			return ruc;
		}
		public void setRuc(String ruc) {
			this.ruc = ruc;
		}
		@Override
		public String toString() {
			return "Compañia [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
					+ ", ruc=" + ruc + "]";
		}
		
		
		
}
