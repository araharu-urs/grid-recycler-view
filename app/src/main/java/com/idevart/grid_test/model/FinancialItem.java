package com.idevart.grid_test.model;

import java.util.ArrayList;
import java.util.List;

public class FinancialItem {
    private final FinancialMenuItem idItem;
    private final String title;
    private final String image;

    public FinancialItem(FinancialMenuItem idItem, String title, String image) {
        this.idItem = idItem;
        this.title = title;
        this.image = image;
    }

    public FinancialMenuItem getIdItem() {
        return idItem;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public static List<FinancialItem> getAllItems() {
        List<FinancialItem> items = new ArrayList<>();

        items.add(new FinancialItem(FinancialMenuItem.btnCashback, "Disposición Efectivo", "acunar"));
        items.add(new FinancialItem(FinancialMenuItem.btnDeposit, "Pago Depósito", "pago"));
        items.add(new FinancialItem(FinancialMenuItem.btnCheckIn, "Check-In", "checkin"));
        items.add(new FinancialItem(FinancialMenuItem.btnReauthCheckIn, "Reautorización Check-In", "calendario"));
        items.add(new FinancialItem(FinancialMenuItem.btnCancelCheckIn, "Cancelación Check-In", "tarjetacancel"));
        items.add(new FinancialItem(FinancialMenuItem.btnCheckOut, "Check-Out", "relojdearena"));
        items.add(new FinancialItem(FinancialMenuItem.btnRentalIn, "Rental-In", "promocion"));
        items.add(new FinancialItem(FinancialMenuItem.btnReauthRentalIn, "Reautorización Rental-In", "comision"));
        items.add(new FinancialItem(FinancialMenuItem.btnCancelRentalIn, "Cancelación Renatl-In", "carpeta"));
        items.add(new FinancialItem(FinancialMenuItem.btnCarReturn, "Car Return", "coches"));
        items.add(new FinancialItem(FinancialMenuItem.btnSale, "Venta", "puntodeventa"));
        items.add(new FinancialItem(FinancialMenuItem.btnPreTip, "Venta Con Propina", "dinero"));
        items.add(new FinancialItem(FinancialMenuItem.btnPosTip, "Venta Pos Propina", "billetera"));
        items.add(new FinancialItem(FinancialMenuItem.btnVoids2, "Cancelación", "error"));
        items.add(new FinancialItem(FinancialMenuItem.btnNoShow, "Venta No Show", "acunar"));
        items.add(new FinancialItem(FinancialMenuItem.btnAdjustSale, "Cierre Preventa", "tres"));
        items.add(new FinancialItem(FinancialMenuItem.btnBalance, "Consulta Saldo", "analitica"));
        items.add(new FinancialItem(FinancialMenuItem.btnRefund, "Devolución", "refunddos"));
        items.add(new FinancialItem(FinancialMenuItem.btnSaleOffline2, "Venta Forzada", "contrato"));
        items.add(new FinancialItem(FinancialMenuItem.btnSaleOffline, "Venta Forzada", "contrato"));
        items.add(new FinancialItem(FinancialMenuItem.btnRefund2, "Devolución", "refunddos"));
        items.add(new FinancialItem(FinancialMenuItem.btnVoids, "Cancelación", "error"));
        items.add(new FinancialItem(FinancialMenuItem.btnComunication, "Prueba de Comunicación", "global"));
        items.add(new FinancialItem(FinancialMenuItem.btnComunication2, "Prueba de Comunicación", "global"));
        items.add(new FinancialItem(FinancialMenuItem.btnCashback2, "Venta No Show", "acunar"));
        items.add(new FinancialItem(FinancialMenuItem.btnPreTip2, "Venta Con Propina", "dinero"));
        return items;
    }
}
