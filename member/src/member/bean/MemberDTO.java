package member.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
//@Data  : 전부다 들어옴. 
public class MemberDTO {
	@NonNull
	private String name;
	@NonNull
	private String id;
	@NonNull
	private String pwd;  // 나중에 특수문자 넣는거
	@NonNull
	private String phone;
	
	
	
}
