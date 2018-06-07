package com.m2i.service;

import javax.ejb.Remote;

@Remote //acces possible à distance via RMI (ok avec @EJB mais pas compatible @Inject)
public interface IServiceDeviseRemote extends IServiceDevise {

}
