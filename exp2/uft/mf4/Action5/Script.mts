Window("Flight Reservation").ActiveX("MaskEdBox").Type "010124" @@ hightlight id_;_918172_;_script infofile_;_ZIP::ssf20.xml_;_
Window("Flight Reservation").WinComboBox("Fly From:").Select DataTable("fromPort", dtLocalSheet) @@ hightlight id_;_852452_;_script infofile_;_ZIP::ssf21.xml_;_
Window("Flight Reservation").WinComboBox("Fly To:").Select DataTable("toPort", dtLocalSheet) @@ hightlight id_;_1114832_;_script infofile_;_ZIP::ssf22.xml_;_
Window("Flight Reservation").WinButton("FLIGHT").Click @@ hightlight id_;_1180240_;_script infofile_;_ZIP::ssf23.xml_;_
Window("Flight Reservation").Dialog("Flights Table").WinButton("OK").Click @@ hightlight id_;_1311128_;_script infofile_;_ZIP::ssf24.xml_;_
Window("Flight Reservation").WinEdit("Name:").Set "Midnight233" @@ hightlight id_;_1114914_;_script infofile_;_ZIP::ssf25.xml_;_
Window("Flight Reservation").WinButton("Insert Order").Click @@ hightlight id_;_917956_;_script infofile_;_ZIP::ssf26.xml_;_
wait 6
Window("Flight Reservation").WinEdit("Order No:").Output CheckPoint("Order No:") @@ hightlight id_;_852684_;_script infofile_;_ZIP::ssf26.xml_;_
Window("Flight Reservation").WinMenu("Menu").Select "File;New Order"