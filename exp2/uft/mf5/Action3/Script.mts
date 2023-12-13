Window("Flight Reservation").WinMenu("Menu").Select "File;New Order"
Window("Flight Reservation").ActiveX("MaskEdBox").Click 0,7 @@ hightlight id_;_66204_;_script infofile_;_ZIP::ssf4.xml_;_
Window("Flight Reservation").ActiveX("MaskEdBox").Type "010124" @@ hightlight id_;_66204_;_script infofile_;_ZIP::ssf5.xml_;_
Window("Flight Reservation").WinComboBox("Fly From:").Select DataTable("fly_from", dtLocalSheet) @@ hightlight id_;_262712_;_script infofile_;_ZIP::ssf6.xml_;_
Window("Flight Reservation").WinComboBox("Fly To:").Select DataTable("fly_to", dtLocalSheet) @@ hightlight id_;_393630_;_script infofile_;_ZIP::ssf7.xml_;_
Window("Flight Reservation").WinButton("FLIGHT").Click @@ hightlight id_;_328190_;_script infofile_;_ZIP::ssf8.xml_;_
Window("Flight Reservation").Dialog("Flights Table").WinButton("OK").Click @@ hightlight id_;_197282_;_script infofile_;_ZIP::ssf9.xml_;_
Window("Flight Reservation").WinEdit("Name:").Set "Jingzhi Zhang" @@ hightlight id_;_721318_;_script infofile_;_ZIP::ssf10.xml_;_
Window("Flight Reservation").WinEdit("Name:").Check CheckPoint("Name:") @@ hightlight id_;_721318_;_script infofile_;_ZIP::ssf10.xml_;_
Window("Flight Reservation").WinRadioButton("Business").Set @@ hightlight id_;_197202_;_script infofile_;_ZIP::ssf11.xml_;_
Window("Flight Reservation").WinEdit("Tickets:").SetSelection 0,1 @@ hightlight id_;_197224_;_script infofile_;_ZIP::ssf12.xml_;_
Window("Flight Reservation").WinEdit("Tickets:").Set "5" @@ hightlight id_;_197224_;_script infofile_;_ZIP::ssf13.xml_;_
Window("Flight Reservation").WinButton("Insert Order").Click
wait 6
Window("Flight Reservation").WinEdit("Order No:").Output CheckPoint("Order No:")
Window("Flight Reservation").WinMenu("Menu").Select "File;Open Order..."
Window("Flight Reservation").Dialog("Open Order").WinCheckBox("Order No.").Set "ON" @@ hightlight id_;_131760_;_script infofile_;_ZIP::ssf15.xml_;_
Window("Flight Reservation").Dialog("Open Order").WinEdit("Edit").Set DataTable("order_number", dtLocalSheet) @@ hightlight id_;_131758_;_script infofile_;_ZIP::ssf16.xml_;_
Window("Flight Reservation").Dialog("Open Order").WinButton("OK").Click