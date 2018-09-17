/*
 * @author Juan Miguel Olguin Salguero
 */
package mx.com.profuturo.mit.reportes.contractuales.servicios;

import java.util.List;

import mx.com.profuturo.mit.infraestructura.BusinessException;
import mx.com.profuturo.mit.infraestructura.DatabaseException;
import mx.com.profuturo.mit.reportes.contractuales.servicios.vo.FormatoCartaPrimerPago;
import mx.com.profuturo.mit.reportes.crystal.servicios.vo.ReportPropertiesVO;

/**
 * @author Juan Miguel Olguin Salguero
 *
 * 
 * 
 */
public interface ReportesContractualesService{
	
	/**
	 * @param nss
	 * @return
	 * @throws DatabaseException
	 */
	public List consultarGP(String nss) throws DatabaseException;
	 
	/**
	 * @param nss
	 * @return
	 * @throws DatabaseException
	 */
	public List consultarBeneficiarioNss(String idPoliza) throws DatabaseException;
	
	public List consultarModalidad(String numRentaVitalicia) throws DatabaseException;
	/**
	 * @param numRentaVitalicia
	 * @return
	 * @throws DatabaseException
	 */
	public List consultarPoliza(String numRentaVitalicia, String idSolMov, String idEndoso ,String idTipoMov) throws DatabaseException;
	
	/**
	 * @param numRentaVitalicia
	 * @return
	 * @throws DatabaseException
	 */
	public List consultarPagos(String numRentaVitalicia, String idSolMov) throws DatabaseException;
	/**
	 * @param nss
	 * @param numRentaVitalicia
	 * @param copiaDestino
	 * @return
	 * @throws BusinessException
	 */
	public ReportPropertiesVO generateReport(String nss,String numRentaVitalicia,String copiaDestino, String idSolMov, String idEndoso ,String idTipoMov) throws BusinessException;
	/**
	 * @param nss
	 * @param numRentaVitalicia
	 * @return
	 * @throws BusinessException
	 */
	public List generateContractualReport(String nss,String numRentaVitalicia) throws BusinessException;
	public List generateContractualReportBeans(String nss,String numRentaVitalicia) throws BusinessException;
	/**
	 * @param nss
	 * @param numRentaVitalicia
	 * @param copiaDestino
	 * @return
	 * @throws BusinessException
	 */
	public ReportPropertiesVO generateReportFormaPago(String idPoliza,String numRentaVitalicia,String copiaDestino,String idSolMov, String idEndoso ,String idTipoMov) throws BusinessException;
	/**
	 * @param nss
	 * @param numRentaVitalicia
	 * @return
	 * @throws BusinessException
	 */
	public ReportPropertiesVO generateReportConstanciaPensionado(String idPoliza,String idSolMov, String idEndoso ,String idTipoMov) throws BusinessException;
	
	public ReportPropertiesVO generateReportCartaPrimerPago(String idPoliza,String idSolMov, String idEndoso ,String idTipoMov) throws BusinessException;
	
	public FormatoCartaPrimerPago generateFormatoCartaPrimerPago(String idPoliza,String idSolMov, String idEndoso ,String idTipoMov) throws BusinessException;
	
	public ReportPropertiesVO generateReportCartaBienvenida(String idPoliza, String idSolMov, String idEndoso ,String idTipoMov) throws BusinessException ;
	
	public List consultaGPIdPoliza(String idPoliza, String idSolMov) throws DatabaseException;
	
	public List consultaBeneficiarioIdPoliza(String idPoliza, String idSolMov, String idEndoso) throws DatabaseException;
	
}
