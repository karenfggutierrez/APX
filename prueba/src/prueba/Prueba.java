package prueba;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class Prueba {

	public static void main(String[] args) {
System.out.println("Solo aqui");

class DetalleCreditCardDTO implements Serializable{

	private static final long serialVersionUID = -1151472617132113764L;
	//private CreditCardDTO tarjeta;
	private String cardNumber;
	private Long nip;
	private String expirationDate;
	private Long blockedIndicator;
	private Date activationDate;

	public DetalleCreditCardDTO(String cardNumber, Long nip, String expirationDate, Long blockedIndicator,
			Date activationDate) {
		super();
		this.cardNumber = cardNumber;
		this.nip = nip;
		this.expirationDate = expirationDate;
		this.blockedIndicator = blockedIndicator;
		this.activationDate = activationDate;
	}
	
	//public CreditCardDTO getTarjeta() {
	//	return tarjeta;
	//}

	//public void setTarjeta(CreditCardDTO tarjeta) {
	//	this.tarjeta = tarjeta;
	//}

	public DetalleCreditCardDTO() {
		super();
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getNip() {
		return nip;
	}

	public void setNip(Long nip) {
		this.nip = nip;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Long getBlockedIndicator() {
		return blockedIndicator;
	}

	public void setBlockedIndicator(Long blockedIndicator) {
		this.blockedIndicator = blockedIndicator;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(activationDate, blockedIndicator, cardNumber, expirationDate, nip);
	}

	@Override
	public String toString() {
		return "DetalleCreditCardDTO [cardNumber=" + cardNumber + ", nip=" + nip + ", expirationDate=" + expirationDate
				+ ", blockedIndicator=" + blockedIndicator + ", activationDate=" + activationDate + "]";

		
	}
	
	public DetalleCreditCardDTO mapToDto(Map<String, Object> result) {
		DetalleCreditCardDTO detalleCreditCardDTO = new DetalleCreditCardDTO();

			detalleCreditCardDTO.setCardNumber(((String) result.get("CARD_NUMBER")));
			detalleCreditCardDTO.setNip(((BigDecimal) result.get("NIP")).longValue());
			detalleCreditCardDTO.setExpirationDate(((String) result.get("EXPIRATION_DATE")));				detalleCreditCardDTO.setBlockedIndicator(((BigDecimal) result.get("BLOCKED_INDICATOR")).longValue());
			detalleCreditCardDTO.setActivationDate(((Date) result.get("ACTIVATION_DATE")));
			System.out.println("Dentro del metodo" + detalleCreditCardDTO + mapToDto(result));
			System.out.println(detalleCreditCardDTO.getCardNumber());
			
				return detalleCreditCardDTO;
				
			}
	
	
}}}
