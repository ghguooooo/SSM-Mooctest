package com.guo.action;

import com.guo.domain.Document;
import com.guo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class DocumentAction {

@Autowired
private DocumentService documentService;

    @RequestMapping(value = "getAllDocuments",method = RequestMethod.POST)
    @ResponseBody
    public List<Document> getAllDocuments()throws Exception{
      return documentService.getAllDocuments();

    }

    @RequestMapping("addDocuments")
    @ResponseBody
    public void addDocuments(String bigTypeId)throws Exception{


    }
}
