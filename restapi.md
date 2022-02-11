# REST API Documentation

Documentação da API para o trabalho de Desenvolvimento de Aplicações Corporativas realizado por Yan



## Autor

A lista  Autor List apresenta todos os Autores.

|Property|descricao|
|--|--|
|id|O identificador único|
|email|O email doAutor|
|nome|O nome do Autor|
|sobrenome|O sobrenome do Autor|
|afiliacao|A afiliacao do Autor|
|orcid|O orcid do Autor|

### Endpoints Autor

#### POST

Salvar um Autor.



Post exemplo:

    {
        "email": "Autor@email.com",
        "nome": "Autor nome",
        "sobrenome": "Autor sobrenome",
        "afiliacao": "afiliacao",
        "orcid": "123456"
    }

#### GET

Retorna uma  lista de todos Autores.



Return exemplo:

    [
        {
            "id": 1,
            "email": "Autor@email.com",
            "nome": "Autor nome",
            "sobrenome": "Autor sobrenome",
            "afiliacao": "afiliacao",
            "orcid": "123456"
        }
    ]

#### GET

Retorna um Autor.

/1

Return exemplo:

    {
        "id": 2,
        "email": "Autor@email.com",
        "nome": "Autor nome",
        "sobrenome": "Autor sobrenome",
        "afiliacao": "afiliacao",
        "orcid": "123456"
    }

#### GET

Retorna Autores por um sobrenome.

/sobrenome/Autor sobrenome

Return exemplo:

    [
        {
            "id": 1,
            "email": "Autor@email.com",
            "nome": "Autor nome",
            "sobrenome": "Autor sobrenome",
            "afiliacao": "afiliacao",
            "orcid": "123456"
        }
    ]

#### PUT

Update em um Autor.



Put exemplo para dar update nos Autores :

	{
        "id": 1,
        "email": "newAutor@email.com",
        "nome": "New Autor nome",
        "sobrenome": "New Autor sobrenome",
        "afiliacao": "New afiliacao",
        "orcid": "12345678"
    }

#### DELETE

Deleta um recurso.

/1

Return exemplo:

	{
        "message": "removed Autor"
	}

## recurso

A lista de recurso apresenta todos os recursos.

|Property|descricao|
|--|--|
|id|O identificador único|
|titulo|The titulo de um recurso|
|descricao|A descricao de um recurso|
|link|O link onde o recurso está armezenado|
|imagem|TA imagem representativa em base64|
|dataCriacao|A data de criacao|
|dataRegistro|A data de registro|
|keyWord|A lista de keywords|
|Autores|A lista de autores|

### Endpoints recurso

#### POST

Salvar um recurso.



Post exemplo:

	{
        "titulo": "recurso titulo",
        "descricao": "recurso descricao",
        "link": "recurso.com",
        "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "dataCriacao": "2021-12-21",
        "dataRegistro": "2021-12-21",
        "keyWord": [
            "keyword exemplo"
        ],
        "Autores": [
            {
                "id": 1
            }
        ]
    }

#### GET

Retornar uma lista de recursos.



Return exemplo:

    [
        {
            "id": 2,
            "titulo": "recurso titulo",
            "descricao": "recurso descricao",
            "link": "recurso.com",
            "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
            "dataCriacao": "2021-12-21",
            "dataRegistro": "2021-12-21",
            "keyWord": [
                "keyword exemplo"
            ],
            "Autores": [
                {
                    "id": 1,
                    "email": "Autor@email.com",
                    "nome": "New Autor nome",
                    "sobrenome": "Autor sobrenome",
                    "afiliacao": "afiliacao",
                    "orcid": "123456"
                }
            ]
        }
    ]

#### GET

Retorna um recurso.

/2

Return exemplo:

	{
        "id": 2,
        "titulo": "recurso titulo",
        "descricao": "recurso descricao",
        "link": "recurso.com",
        "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "dataCriacao": "2021-12-21",
        "dataRegistro": "2021-12-21",
        "keyWord": [
            "keyword exemplo"
        ],
        "Autores": [
            {
                "id": 1,
                "email": "Autor@email.com",
                "nome": "New Autor nome",
                "sobrenome": "Autor sobrenome",
                "afiliacao": "afiliacao",
                "orcid": "123456"
            }
        ]
    }

#### GET

Retorna recursos por um Autor.

/Autor/1

Return exemplo:

    [
        {
            "id": 2,
            "titulo": "recurso titulo",
            "descricao": "recurso descricao",
            "link": "recurso.com",
            "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
            "dataCriacao": "2021-12-21",
            "dataRegistro": "2021-12-21",
            "keyWord": [
                "keyword exemplo"
            ],
            "Autores": [
                {
                    "id": 1,
                    "email": "Autor@email.com",
                    "nome": "New Autor nome",
                    "sobrenome": "Autor sobrenome",
                    "afiliacao": "afiliacao",
                    "orcid": "123456"
                }
            ]
        }
    ]

#### GET

Retorna recursos por uma colecao.

/colecao/3

Return exemplo:

    [
        {
            "id": 2,
            "titulo": "recurso titulo",
            "descricao": "recurso descricao",
            "link": "recurso.com",
            "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
            "dataCriacao": "2021-12-21",
            "dataRegistro": "2021-12-21",
            "keyWord": [
                "keyword exemplo"
            ],
            "Autores": [
                {
                    "id": 1,
                    "email": "Autor@email.com",
                    "nome": "New Autor nome",
                    "sobrenome": "Autor sobrenome",
                    "afiliacao": "afiliacao",
                    "orcid": "123456"
                }
            ]
        }
    ]

#### PUT

Update em um recurso.



Put exemplo de update em recursos:

	{
        "id": 2,
        "titulo": "New recurso titulo",
        "descricao": "New recurso descricao",
        "link": "newrecurso.com",
        "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "dataCriacao": "2021-12-22",
        "dataRegistro": "2021-12-22",
        "keyWord": [
            "new keyword exemplo"
        ],
        "Autores": [
            {
                "id": 4
            }
        ]
    }

#### DELETE

Deleta um recurso.

/2

Return exemplo:

	{
        "message": "removed recurso"
	}

## ColecaoEvento


|Property|descricao|
|--|--|
|id|O identificador único|
|titulo|O titulo do ColecaoEvento|
|descricao|A descricao do ColecaoEvento|
|imagem|Uma imagem representativa em base64|
|recursos|A lista de recursos|
|dataInicio|A data de comeco do ColecaoEvento|
|dataFim|A data fim do ColecaoEvento|

### Endpoints ColecaoEvento

#### POST

Salvar um ColecaoEvento.



Post exemplo:

    {
        "titulo": "ColecaoEvento titulo",
        "descricao": "ColecaoEvento descricao",
        "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "recursos": [
            {
                "id": 2
            }
        ],
        "dataInicio": "2022-01-01",
        "dataFim": "2022-01-30"
    }

#### GET

Retorna uma lista de todos os ColecaoEventos.



Return exemplo:

    [
        {
            "id": 3,
            "titulo": "ColecaoEvento titulo",
            "descricao": "ColecaoEvento descricao",
            "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
            "recursos": [
                {
                    "id": 2,
                    "titulo": "New recurso titulo",
                    "descricao": "New recurso descricao",
                    "link": "newrecurso.com",
                    "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
                    "dataCriacao": "2021-12-22",
                    "dataRegistro": "2021-12-22",
                    "keyWord": [
                        "new keyword exemplo"
                    ],
                    "Autores": [
                        {
                            "id": 4,
                            "email": "Autor@email.com",
                            "nome": "Autor nome",
                            "sobrenome": "Autor sobrenome",
                            "afiliacao": "afiliacao",
                            "orcid": "123456"
                        }
                    ]
                }
            ],
            "dataInicio": "2022-01-01",
            "dataFim": "2022-01-30"
        }
    ]

#### GET

Retorna um ColecaoEvento.

/3

Return exemplo:

    {
        "id": 3,
        "titulo": "ColecaoEvento titulo",
        "descricao": "ColecaoEvento descricao",
        "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "recursos": [
            {
                "id": 2,
                "titulo": "New recurso titulo",
                "descricao": "New recurso descricao",
                "link": "newrecurso.com",
                "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
                "dataCriacao": "2021-12-22",
                "dataRegistro": "2021-12-22",
                "keyWord": [
                    "new keyword exemplo"
                ],
                "Autores": [
                    {
                        "id": 4,
                        "email": "Autor@email.com",
                        "nome": "Autor nome",
                        "sobrenome": "Autor sobrenome",
                        "afiliacao": "afiliacao",
                        "orcid": "123456"
                    }
                ]
            }
        ],
        "dataInicio": "2022-01-01",
        "dataFim": "2022-01-30"
    }

#### GET

Retorna ColecaoEvento por um período de tempo.

/period?dataInicio=2021-12-01&dataFim=2024-12-31

Return exemplo:

    [
        {
            "id": 3,
            "titulo": "ColecaoEvento titulo",
            "descricao": "ColecaoEvento descricao",
            "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
            "recursos": [
                {
                    "id": 2,
                    "titulo": "New recurso titulo",
                    "descricao": "New recurso descricao",
                    "link": "newrecurso.com",
                    "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
                    "dataCriacao": "2021-12-22",
                    "dataRegistro": "2021-12-22",
                    "keyWord": [
                        "new keyword exemplo"
                    ],
                    "Autores": [
                        {
                            "id": 4,
                            "email": "Autor@email.com",
                            "nome": "Autor nome",
                            "sobrenome": "Autor sobrenome",
                            "afiliacao": "afiliacao",
                            "orcid": "123456"
                        }
                    ]
                }
            ],
            "dataInicio": "2022-01-01",
            "dataFim": "2022-01-30"
        }
    ]

#### PUT

Update um ColecaoEvento.



Put exemplo de um update em ColecaoEventos:

    {
	"id": 3,
        "titulo": "New ColecaoEvento titulo",
        "descricao": "New ColecaoEvento descricao",
        "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "recursos": [
            {
                "id": 5
            }
        ],
        "dataInicio": "2022-01-02",
        "dataFim": "2022-01-29"
    }

#### DELETE

Deleta um ColecaoEvento.

/3

Return exemplo:

	{
        "message": "removed ColecaoEvento"
	}


## ColecaoCurso


|Property|descricao|
|--|--|
|id|O identificador único|
|titulo|O titulo do ColecaoCurso|
|descricao|A descricao do ColecaoCurso|
|imagem|Uma imagem representativa em base64|
|recursos|Uma lista de recursos|
|dataRegistro|A data de registro do ColecaoCurso|

### Endpoints ColecaoCurso

#### POST

Save a ColecaoCurso.



Post exemplo:

    {
        "titulo": "ColecaoCurso titulo",
        "descricao": "ColecaoCurso descricao",
        "dataRegistro": "2021-12-22",
        "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "recursos": [
            {
                "id": 2
            }
        ]
    }

#### GET

Retorna uma lista de todos os ColecaoCursos.



Return exemplo:

    [
        {
            "id": 8,
            "titulo": "ColecaoCurso titulo",
            "descricao": "ColecaoCurso descricao",
            "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
            "recursos": [
                {
                    "id": 2,
                    "titulo": "New recurso titulo",
                    "descricao": "New recurso descricao",
                    "link": "newrecurso.com",
                    "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
                    "dataCriacao": "2021-12-22",
                    "dataRegistro": "2021-12-22",
                    "keyWord": [
                        "new keyword exemplo"
                    ],
                    "Autores": [
                        {
                            "id": 4,
                            "email": "Autor@email.com",
                            "nome": "Autor nome",
                            "sobrenome": "Autor sobrenome",
                            "afiliacao": "afiliacao",
                            "orcid": "123456"
                        }
                    ]
                }
            ],
            "dataRegistro": "2021-12-22"
        }
    ]

#### GET

Retorna um ColecaoCurso.

/8

Return exemplo:

    {
        "id": 8,
        "titulo": "ColecaoCurso titulo",
        "descricao": "ColecaoCurso descricao",
        "imagem": "R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "recursos": [
            {
                "id": 2,
                "titulo": "New recurso titulo",
                "descricao": "New recurso descricao",
                "link": "newrecurso.com",
                "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
                "dataCriacao": "2021-12-22",
                "dataRegistro": "2021-12-22",
                "keyWord": [
                    "new keyword exemplo"
                ],
                "Autores": [
                    {
                        "id": 4,
                        "email": "Autor@email.com",
                        "nome": "Autor nome",
                        "sobrenome": "Autor sobrenome",
                        "afiliacao": "afiliacao",
                        "orcid": "123456"
                    }
                ]
            }
        ],
        "dataRegistro": "2021-12-22"
    }

#### PUT

Update em um ColecaoCurso.



Put exemplo em update um ColecaoCursos:

    {
        "id": 8,
        "titulo": "New ColecaoCurso titulo",
        "descricao": "New ColecaoCurso descricao",
        "imagem": "S0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==",
        "dataRegistro": "2021-12-23",
        "recursos": [
            {
                "id": 9
            }
        ]
    }

#### DELETE

Deleta um ColecaoCurso.

/8

Return exemplo:

	{
        "message": "removed ColecaoCurso"
	}
