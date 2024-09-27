package com.app.FundFlow_BE.function;

import com.app.FundFlow_BE.model.Stage;
import com.app.FundFlow_BE.model.Startup;
import com.app.FundFlow_BE.model.FundingRound;
import com.app.FundFlow_BE.model.Founder;
import com.app.FundFlow_BE.model.Document;
import com.app.FundFlow_BE.model.Investor;
import com.app.FundFlow_BE.enums.RoundStatus;
import com.app.FundFlow_BE.enums.StageName;
import com.app.FundFlow_BE.converter.StageNameConverter;
import com.app.FundFlow_BE.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.FundFlow_BE.repository.FundingRoundRepository;
import com.app.FundFlow_BE.repository.StageRepository;
import com.app.FundFlow_BE.repository.DocumentRepository;
import com.app.FundFlow_BE.repository.InvestorRepository;
import com.app.FundFlow_BE.repository.FounderRepository;
import com.app.FundFlow_BE.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
