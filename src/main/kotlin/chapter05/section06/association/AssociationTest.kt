package chapter05.section06.association

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Kildong")

    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}
class Patient(val name: String){
    fun doctorList(d: Doctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String){
    fun patientList(p: Patient){
        println("Doctor: $name, Patient: ${p.name}")
    }
}