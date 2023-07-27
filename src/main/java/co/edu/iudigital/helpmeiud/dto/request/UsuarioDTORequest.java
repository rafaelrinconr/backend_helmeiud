package co.edu.iudigital.helpmeiud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTORequest {

    @NotNull(message = "Username obligatorio")
    @Email(message = "No cumple con formato Email")
    String username;

    @NotNull (message = "NOmbre obligatorio")
    @NotBlank( message = "nombre obligatorio")
    @Size(min = 2, max = 120)
    String nombre;

    String apellido;

    @Size(min = 5, message = "Debe suministrar contraseña segura")
    String password;

    @JsonProperty("red_social")
    Boolean redSocial;

    @DateTimeFormat
    @JsonProperty("fecha_nacimiento")
    LocalDate fechaNacimiento;

    Boolean enable;

    String image;



}
