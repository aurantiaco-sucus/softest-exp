Dialog("Login").WinEdit("Agent Name:").Set "jingzhi" @@ hightlight id_;_393932_;_script infofile_;_ZIP::ssf1.xml_;_
Dialog("Login").WinEdit("Agent Name:").Check CheckPoint("Agent Name:")
Dialog("Login").WinEdit("Agent Name:").Type  micTab @@ hightlight id_;_393932_;_script infofile_;_ZIP::ssf2.xml_;_
Dialog("Login").WinEdit("Password:").SetSecure "6578558871bb1e7ac79c45f40dcfce63db04fe66" @@ hightlight id_;_524806_;_script infofile_;_ZIP::ssf3.xml_;_
Dialog("Login").WinEdit("Password:").Type  micReturn @@ hightlight id_;_524806_;_script infofile_;_ZIP::ssf4.xml_;_
Window("Flight Reservation").ActiveX("MaskEdBox").Type "010124" @@ hightlight id_;_131932_;_script infofile_;_ZIP::ssf5.xml_;_
Window("Flight Reservation").WinComboBox("Fly From:").Select DataTable("fromPort", dtLocalSheet) @@ hightlight id_;_459476_;_script infofile_;_ZIP::ssf6.xml_;_
Window("Flight Reservation").WinComboBox("Fly To:").Select DataTable("toPort", dtLocalSheet) @@ hightlight id_;_459536_;_script infofile_;_ZIP::ssf7.xml_;_
Window("Flight Reservation").WinButton("FLIGHT").Click @@ hightlight id_;_655830_;_script infofile_;_ZIP::ssf8.xml_;_
Window("Flight Reservation").Dialog("Flights Table").WinButton("OK").Click @@ hightlight id_;_262862_;_script infofile_;_ZIP::ssf9.xml_;_
Window("Flight Reservation").WinRadioButton("First").Set @@ hightlight id_;_459468_;_script infofile_;_ZIP::ssf10.xml_;_
Window("Flight Reservation").WinEdit("Name:").Set "Midnight233" @@ hightlight id_;_590342_;_script infofile_;_ZIP::ssf11.xml_;_
Window("Flight Reservation").WinEdit("Tickets:").SetSelection 0,1 @@ hightlight id_;_787084_;_script infofile_;_ZIP::ssf12.xml_;_
Window("Flight Reservation").WinEdit("Tickets:").Set "5" @@ hightlight id_;_787084_;_script infofile_;_ZIP::ssf13.xml_;_
Window("Flight Reservation").WinButton("Insert Order").Click @@ hightlight id_;_655836_;_script infofile_;_ZIP::ssf14.xml_;_