package org.example.services;

import org.example.models.LinkUtil;
import org.example.models.form.LinkUtilForm;

import java.util.List;

public interface ILinkUtilService {
    List<LinkUtil> getAll();

    LinkUtil create(LinkUtilForm form);
}
