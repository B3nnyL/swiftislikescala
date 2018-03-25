extension Double {
    var km: Double { return self * 1_000.0 }  
    var mm: Double { return self / 1_000.0 }
}

let oneMilimeter = 1.mm
print("One inch is \(oneMilimeter) meters")

let oneKilometer = 1.km
print("One kilometer is \(oneKilometer) meters")
