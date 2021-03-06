package lt2020.sveikinimai.kodasap;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PagingData {
	private int limit;
	
	
	public PagingData() {
		this.setLimit(5); // <numatytasis filtras>
	}
	
// getters and setters

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}


}