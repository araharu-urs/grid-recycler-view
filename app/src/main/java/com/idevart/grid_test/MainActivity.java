package com.idevart.grid_test;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

import android.util.DisplayMetrics;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.idevart.grid_test.model.FinancialItem;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView collectionRecycler;
    List<FinancialItem> items = FinancialItem.getAllItems();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initialize();
    }

    private void initialize() {

        int spanCount = getSpanCountByDp(this);

        collectionRecycler = findViewById(R.id.collectionRecycler);
        collectionRecycler.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, spanCount);
        collectionRecycler.setLayoutManager(gridLayoutManager);

        FinancialAdapter adapter = new FinancialAdapter(items, this::onItemClick);
        collectionRecycler.setAdapter(adapter);
    }

    void onItemClick(FinancialItem item) {

        Log.d("DEBUG_ITEM", "ID: " + item.getIdItem() +
                ", Título: " + item.getTitle() +
                ", Imagen: " + item.getImage());
        switch (item.getIdItem()) {
            case btnSale:
                // Acción para Venta
                break;
            case btnRefund:
                // Acción para Devolución
                break;
            case btnRefund2:
                // Acción para Devolución alternativa
                break;
            case btnVoids:
                // Acción para Cancelación
                break;
            case btnVoids2:
                // Acción para Cancelación alternativa
                break;
            case btnPreTip:
                // Acción para Venta con propina
                break;
            case btnPreTip2:
                // Acción para Venta con propina alternativa
                break;
            case btnPosTip:
                // Acción para Venta pospropina
                break;
            case btnAdjustSale:
                // Acción para Cierre preventa
                break;
            case btnCheckIn:
                // Acción para Check-In
                break;
            case btnReauthCheckIn:
                // Acción para Reautorización Check-In
                break;
            case btnCancelCheckIn:
                // Acción para Cancelación Check-In
                break;
            case btnCheckOut:
                // Acción para Check-Out
                break;
            case btnRentalIn:
                // Acción para Rental-In
                break;
            case btnReauthRentalIn:
                // Acción para Reautorización Rental-In
                break;
            case btnCancelRentalIn:
                // Acción para Cancelación Rental-In
                break;
            case btnCarReturn:
                // Acción para Car Return
                break;
            case btnNoShow:
                // Acción para Venta No Show
                break;
            case btnSaleOffline:
                // Acción para Venta forzada
                break;
            case btnSaleOffline2:
                // Acción alternativa para Venta forzada
                break;
            case btnComunication:
                // Acción para Prueba de comunicación
                break;
            case btnComunication2:
                // Acción alternativa para Prueba de comunicación
                break;
            case btnCashback:
                // Acción para Disposición efectivo
                break;
            case btnCashback2:
                // Acción alternativa para Disposición efectivo
                break;
            case btnDeposit:
                // Acción para Pago Depósito
                break;
            case btnBalance:
                // Acción para Consulta de saldo
                break;
        }
    }

    public static int getSpanCountByDp(Context context) {
        int smallestWidthDp = context.getResources().getConfiguration().smallestScreenWidthDp;

        if (smallestWidthDp < 411) {
            return 2; // Teléfonos chicos
        } else if (smallestWidthDp < 600) {
            return 2; // Teléfonos grandes
        } else if (smallestWidthDp < 720) {
            return 2; // Tablets 7"
        } else {
            return 3; // Tablets 10" o más
        }
    }
}

class ScreenUtils {
    public enum ScreenSizeCategory {
        SMALL, NORMAL, LARGE, XLARGE, UNDEFINED
    }

    // Categoría de tamaño de pantalla
    public static ScreenSizeCategory getScreenSizeCategory(Context context) {
        int screenLayout = context.getResources().getConfiguration().screenLayout;
        int sizeMask = screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;

        switch (sizeMask) {
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                return ScreenSizeCategory.SMALL;
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                return ScreenSizeCategory.NORMAL;
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                return ScreenSizeCategory.LARGE;
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                return ScreenSizeCategory.XLARGE;
            default:
                return ScreenSizeCategory.UNDEFINED;
        }
    }
}
