# <h1 align="center">EX02 API Clinica Dental</h1>

<h3>1. Introducción</h3>
<p>En el presente proyecto del Bootcamp Full Stack correspondiente a la parte Spring Framework se espera que el alumno demuestre todos los conocimientos adquiridos en desarrollo de APIs. </p>


<h3>2. Descripción </h3>
<p>Desde el departamento de producto nos piden crear el backend correspondiente al sistema de gestión de citas para una Clínica Dental.</p>
<p>Para ello el cliente deberá ser capaz de registrarse en la aplicación, hacer login & logout y acceder a su área de cliente, todo ello visualmente desde el navegador.(*** en este punto el registro y login no son necesarios) En su área de cliente deberá poder ver una lista de las citas que tiene a futuro, crear citas, modificarlas y anularlas.<br>

También existirá una zona de usuario con sus datos personales, que solo podrá ver él mismo. Además, los dentistas deberán poder registrarse como profesionales, hacer login y logout y ver todas las citas y clientes registrados.<br>

Teniendo en cuenta los requisitos, llegamos a la conclusión de que este sería el mínimo de endpoints convenientes:</p>
<ol>
<li>Perfil de usuario</li>
<li>Modificación de datos del perfil</li>
<li>Creación de citas</li>
<li>Modificación de citas</li>
<li>Anulación de citas</li>
<li>Ver todas las citas que tengo como cliente (solo las propias)</li>
<li>Ver todas las citas existentes (como dentista)</li>
<li>Ver todos los clientes registrados (como dentista)</li>
</ol>

<h3>EXTRAS</h3>
<ol>
<li>Ver una cita en detalle</li>
<li>Elegir médico en la cita</li>
<li>Como médico, poder ver solo mis citas</li>
<li>Añadir tipos de intervención / consulta a las citas</li>
</ol>

<p>En esta primera fase de proyecto el alumno ha de realizar una  API REST completa,   con   Spring Framework,   que   cumpla   con   los   requisitos   anteriormente planteados. <br>

Deﬁne los endpoints necesarios para que el backend pueda cumplir con lo establecido, nutriendo las diferentes vistas de frontend. <br>

 Además de de lo mencionado anteriormente el alumno ha de incluir la siguiente funcionalidad: </p>
 
 <ul>
 <li>Mysql</li>
 <li>JPA</li>
 <li>Relaciones necesarias</li>
 <li>CRUD de los diferentes modelos.</li>
 <li>Excelente Readme (IMPORTANTE). </li>
 </ul>
 
 #
 <h1 align="center">Postman</h1>
 
 # Project: ClinicaDental
# 📁 Collection: Patient 


## End-point: GET_BY_ID
### Method: GET
>```
>localhost:8181/api/patient/3
>```
### Response: 200
```json
{
    "id": 3,
    "dni": "7889956D",
    "nameSurname": "Encarna Sastre",
    "mail": "mail3@gmail.com"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>localhost:8181/api/patient
>```
### Body (**raw**)

```json

```

### Response: 200
```json
[
    {
        "id": 1,
        "dni": "1478935B",
        "nameSurname": "Palmira Romia",
        "mail": "mail1@hotmail.com"
    },
    {
        "id": 2,
        "dni": "4178958C",
        "nameSurname": "Miguel Sastre",
        "mail": "mail2@gmail.com"
    },
    {
        "id": 3,
        "dni": "7889956D",
        "nameSurname": "Encarna Sastre",
        "mail": "mail3@gmail.com"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE_Patient
### Method: PUT
>```
>localhost:8181/api/patient
>```
### Body (**raw**)

```json
{
    "id": 2,
    "dni": "4178958C",
    "nameSurname": "Miguel Sastre - Modificado",
    "mail": "mail2@gmail.com",
    "oldPsw":"psw2",
    "newPsw":"psw2"
}
```

### Response: 200
```json
{
    "id": 2,
    "dni": "4178958C",
    "nameSurname": "Miguel Sastre - Modificado",
    "mail": "mail2@gmail.com"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>localhost:8181/api/patient
>```
### Body (**raw**)

```json
    {
        "dni": "1234789C",
        "nameSurname": "{{$randomFullName}}",
        "mail": "{{$randomEmail}}",
        "psw": "pswnueva"

    }
```

### Response: 200
```json
{
    "id": 5,
    "dni": "1234789C",
    "nameSurname": "Dewey Hauck I",
    "mail": "Sammie.Lind@gmail.com"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>localhost:8181/api/patient/5
>```
### Response: 200
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Dentist 


## End-point: GET_ALL
### Method: GET
>```
>localhost:8181/api/dentist
>```
### Response: 200
```json
[
    {
        "id": 1,
        "dni": "1234578C",
        "nameSurname": "Ripley Romia",
        "mail": "mail4@hotmail.com",
        "speciality": "General Dentist"
    },
    {
        "id": 2,
        "dni": "4775528B",
        "nameSurname": "Nela Romia",
        "mail": "mail5@hotmail.com",
        "speciality": "Orthodontist"
    },
    {
        "id": 3,
        "dni": "4774411T",
        "nameSurname": "Encarna Segura",
        "mail": "mail8@hotmail.com",
        "speciality": "Periodontist"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_NAME
### Method: GET
>```
>localhost:8181/api/dentist/nameSurname/Nela Romia
>```
### Response: 200
```json
{
    "id": 2,
    "dni": "4775528B",
    "nameSurname": "Nela Romia",
    "mail": "mail5@hotmail.com",
    "speciality": "Orthodontist"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>localhost:8181/api/dentist/3
>```
### Response: 200
```json
{
    "id": 3,
    "dni": "4774411T",
    "nameSurname": "Encarna Segura",
    "mail": "mail8@hotmail.com",
    "speciality": "Periodontist"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE
### Method: POST
>```
>localhost:8181/api/dentist
>```
### Body (**raw**)

```json
    {
        "dni": "1477898T",
        "nameSurname": "{{$randomFullName}}",
        "mail": "{{$randomEmail}}",
        "psw": "psw10",
        "speciality": "General Dentist"
        
    }
```

### Response: 200
```json
{
    "id": 4,
    "dni": "1477898T",
    "nameSurname": "Tabitha Lemke",
    "mail": "Freda.Mosciski74@hotmail.com",
    "speciality": "General Dentist"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>localhost:8181/api/dentist
>```
### Body (**raw**)

```json
{
    "id": 3,
    "dni": "4774411T",
    "nameSurname": "Encarna Segura - modificado",
    "mail": "mail8@hotmail.com- modificado",
    "speciality": "Periodontist",
    "oldPsw": "psw6",
    "newPsw": "new psw"
}
```

### Response: 200
```json
{
    "id": 3,
    "dni": "4774411T",
    "nameSurname": "Encarna Segura - modificado",
    "mail": "mail8@hotmail.com- modificado",
    "speciality": "Periodontist"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: DELETE
### Method: DELETE
>```
>localhost:8181/api/dentist/4
>```
### Response: 200
```json
null
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Appointment 


## End-point: CREATE
### Method: POST
>```
>{{host}}/appointment/1
>```
### Body (**raw**)

```json
    {
        "dateAppointment": "2023-04-23T14:30:00",
        "idDentist": 2
    }
```

### Response: 200
```json
{
    "id": 5,
    "dateAppointment": "2023-04-23T14:30:00",
    "infoDentist": {
        "id": 1,
        "nameSurname": "Ripley Romia",
        "mail": "mail4@hotmail.com",
        "speciality": "General Dentist"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>{{host}}/appointment
>```
### Response: 200
```json
[
    {
        "id": 1,
        "dateAppointment": "2023-04-19T15:30:00",
        "dentistDTO": {
            "id": 3,
            "dni": "4774411T",
            "nameSurname": "Encarna Segura - modificado",
            "mail": "mail8@hotmail.com- modificado",
            "speciality": "Periodontist"
        },
        "patientDTO": {
            "id": 1,
            "dni": "1478935B",
            "nameSurname": "Palmira Romia",
            "mail": "mail1@hotmail.com"
        }
    },
    {
        "id": 2,
        "dateAppointment": "2023-05-21T12:35:00",
        "dentistDTO": {
            "id": 3,
            "dni": "4774411T",
            "nameSurname": "Encarna Segura - modificado",
            "mail": "mail8@hotmail.com- modificado",
            "speciality": "Periodontist"
        },
        "patientDTO": {
            "id": 2,
            "dni": "4178958C",
            "nameSurname": "Miguel Sastre - Modificado",
            "mail": "mail2@gmail.com"
        }
    },
    {
        "id": 3,
        "dateAppointment": "2023-05-05T13:05:00",
        "dentistDTO": {
            "id": 1,
            "dni": "1234578C",
            "nameSurname": "Ripley Romia",
            "mail": "mail4@hotmail.com",
            "speciality": "General Dentist"
        },
        "patientDTO": {
            "id": 3,
            "dni": "7889956D",
            "nameSurname": "Encarna Sastre",
            "mail": "mail3@gmail.com"
        }
    },
    {
        "id": 4,
        "dateAppointment": "2023-04-23T14:30:00",
        "dentistDTO": {
            "id": 1,
            "dni": "1234578C",
            "nameSurname": "Ripley Romia",
            "mail": "mail4@hotmail.com",
            "speciality": "General Dentist"
        },
        "patientDTO": {
            "id": 2,
            "dni": "4178958C",
            "nameSurname": "Miguel Sastre - Modificado",
            "mail": "mail2@gmail.com"
        }
    },
    {
        "id": 5,
        "dateAppointment": "2023-04-23T14:30:00",
        "dentistDTO": {
            "id": 1,
            "dni": "1234578C",
            "nameSurname": "Ripley Romia",
            "mail": "mail4@hotmail.com",
            "speciality": "General Dentist"
        },
        "patientDTO": {
            "id": 2,
            "dni": "4178958C",
            "nameSurname": "Miguel Sastre - Modificado",
            "mail": "mail2@gmail.com"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID
### Method: GET
>```
>{{host}}/appointment/1
>```
### Response: 200
```json
{
    "id": 1,
    "dateAppointment": "2023-04-19T15:30:00",
    "dentistDTO": {
        "id": 3,
        "dni": "4774411T",
        "nameSurname": "Encarna Segura - modificado",
        "mail": "mail8@hotmail.com- modificado",
        "speciality": "Periodontist"
    },
    "patientDTO": {
        "id": 1,
        "dni": "1478935B",
        "nameSurname": "Palmira Romia",
        "mail": "mail1@hotmail.com"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_DNI_Patient
### Method: GET
>```
>{{host}}/appointment/dni/1478935B
>```
### Response: 200
```json
[
    {
        "id": 1,
        "dateAppointment": "2023-04-19T15:30:00",
        "infoDentist": {
            "id": 3,
            "nameSurname": "Encarna Segura - modificado",
            "mail": "mail8@hotmail.com- modificado",
            "speciality": "Periodontist"
        }
    },
    {
        "id": 6,
        "dateAppointment": "2023-04-23T14:30:00",
        "infoDentist": {
            "id": 1,
            "nameSurname": "Ripley Romia",
            "mail": "mail4@hotmail.com",
            "speciality": "General Dentist"
        }
    },
    {
        "id": 7,
        "dateAppointment": "2023-04-23T14:30:00",
        "infoDentist": {
            "id": 1,
            "nameSurname": "Ripley Romia",
            "mail": "mail4@hotmail.com",
            "speciality": "General Dentist"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_BY_ID_Dentist
### Method: GET
>```
>{{host}}/appointment/dentist/1
>```
### Response: 200
```json
[
    {
        "id": 3,
        "dateAppointment": "2023-05-05T13:05:00",
        "patientDTO": {
            "id": 3,
            "dni": "7889956D",
            "nameSurname": "Encarna Sastre",
            "mail": "mail3@gmail.com"
        }
    },
    {
        "id": 4,
        "dateAppointment": "2023-04-23T14:30:00",
        "patientDTO": {
            "id": 2,
            "dni": "4178958C",
            "nameSurname": "Miguel Sastre - Modificado",
            "mail": "mail2@gmail.com"
        }
    },
    {
        "id": 5,
        "dateAppointment": "2023-04-23T14:30:00",
        "patientDTO": {
            "id": 2,
            "dni": "4178958C",
            "nameSurname": "Miguel Sastre - Modificado",
            "mail": "mail2@gmail.com"
        }
    },
    {
        "id": 6,
        "dateAppointment": "2023-04-23T14:30:00",
        "patientDTO": {
            "id": 1,
            "dni": "1478935B",
            "nameSurname": "Palmira Romia",
            "mail": "mail1@hotmail.com"
        }
    },
    {
        "id": 7,
        "dateAppointment": "2023-04-23T14:30:00",
        "patientDTO": {
            "id": 1,
            "dni": "1478935B",
            "nameSurname": "Palmira Romia",
            "mail": "mail1@hotmail.com"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: UPDATE
### Method: PUT
>```
>{{host}}/appointment/1
>```
### Body (**raw**)

```json
{
    "idAppointment": 1,
    "psw": "1234879",
    "newDate": "2023-06-25T15:30:00",
    "idDentist": 2
}
```

### Response: 200
```json
{
    "id": 1,
    "dateAppointment": "2023-06-25T15:30:00",
    "infoDentist": {
        "id": 2,
        "nameSurname": "Nela Romia",
        "mail": "mail5@hotmail.com",
        "speciality": "Orthodontist"
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃


