package com.sic.app.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.sic.app.entities.FormData;
import com.sic.app.models.FormDataDTO;
import com.sic.app.models.FormDataRequest;

@Mapper(componentModel = "spring")
public interface FormDataMapper {

    FormDataMapper INSTANCE = Mappers.getMapper(FormDataMapper.class);

    // Mapea FormDataRequest a FormData (no mapea los campos creados automáticamente)
    @Mapping(target = "createdDate", ignore = true)  // Ignorar el campo creado
    @Mapping(target = "id", ignore = true) // Ignorar el campo modificado
    FormData formDataRequestToFormData(FormDataRequest formDataRequest);

    // Mapea FormData a FormDataDTO
    FormDataDTO formDataToFormDataDTO(FormData formData);
}
