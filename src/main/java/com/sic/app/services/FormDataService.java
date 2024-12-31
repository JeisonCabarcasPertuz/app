package com.sic.app.services;

import com.sic.app.models.FormDataDTO;
import com.sic.app.models.FormDataRequest;

public interface FormDataService {
    FormDataDTO createRecord(FormDataRequest formDataRequest);
}
