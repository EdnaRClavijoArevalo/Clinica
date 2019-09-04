package universitaria.edna.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="maquinaria_examen")
public class MaquinariaExamenEntity extends BaseEntity {


  @Id
  @NotNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id", nullable = false)
  private long id;

  @Column(name="id_examen_realizado")
  private long idExamenRealizado;

  @Column(name="id_dispositivo_medico")
  private long idDispositivoMedico;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getIdExamenRealizado() {
    return this.idExamenRealizado;
  }

  public void setIdExamenRealizado(long idExamenRealizado) {
    this.idExamenRealizado = idExamenRealizado;
  }

  public long getIdDispositivoMedico() {
    return this.idDispositivoMedico;
  }

  public void setIdDispositivoMedico(long idDispositivoMedico) {
    this.idDispositivoMedico = idDispositivoMedico;
  }
}
