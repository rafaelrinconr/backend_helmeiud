package co.edu.iudigital.helpmeiud.dto.response;

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


@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTO {


    String username;

    String nombre;

    String apellido;

    Boolean redSocial;

    LocalDate fechaNacimiento;

    Boolean enable;

    String image;

    Long roleId;

}
