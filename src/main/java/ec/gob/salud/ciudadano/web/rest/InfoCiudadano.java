package ec.gob.salud.ciudadano.web.rest;

 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.msp.infociudadano.BusquedaPorNuiRequest;
import ec.gob.msp.infoseguro.BusquedaSeguroPorNuiRequest;
import ec.gob.msp.infociudadano.BusquedaPorNuiResponse;
import ec.gob.msp.infoseguro.BusquedaSeguroPorNuiResponse;
import ec.gob.salud.clienteConsultaCiudadano.Proveedor;
import ec.gob.salud.clienteConsultaCiudadano.ProveedorSeguro;
 
@RestController
@RequestMapping("/api")
public class InfoCiudadano {
 

    @PostMapping("/buscar-ciudadano")
    ResponseEntity<BusquedaPorNuiResponse> buscarCiudadano(@RequestBody Criterio request) {
        BusquedaPorNuiRequest bnui = new BusquedaPorNuiRequest();
        bnui.setNUI(request.getIdentificacion());
        BusquedaPorNuiResponse response = null;
        try {
            response = Proveedor.getProveedor().busquedaPorNui(bnui);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return ResponseEntity.ok().body(response);
    }
    
    
    @PostMapping("/buscar-ciudadano-seguros")
    ResponseEntity<BusquedaSeguroPorNuiResponse> buscarSeguros(@RequestBody Criterio request) {
        BusquedaSeguroPorNuiRequest bnui = new BusquedaSeguroPorNuiRequest();
        bnui.setNUI(request.getIdentificacion());
        bnui.setFechaCobertura(request.getFecha());
        
        BusquedaSeguroPorNuiResponse response = null;
        try {
            response = ProveedorSeguro.getProveedor().busquedaPorNiu(bnui);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok().body(response);
    }

    
}

