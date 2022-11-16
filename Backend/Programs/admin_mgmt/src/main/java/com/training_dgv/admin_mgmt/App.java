package com.training_dgv.admin_mgmt;

import AdminController.AdminController;
import models.Admin;

public class App 
{
    public static void main( String[] args )
    {
        AdminController adminController= new AdminController();
        adminController.deleteAdmin(2);
    }
}
