document.addEventListener("DOMContentLoaded", function() {
    var ctx = document.getElementById('myChart').getContext('2d');

    var myChart = new Chart(ctx, {
        type: 'pie',
        data: {
            labels: ['Moyen', 'Amateur', 'Exellent', 'Bon', 'Debutant'],
            datasets: [{
                label: 'Votes',
                data: [4, 2, 0, 0, 0],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            plugins: {
                title: {
                    display: true,
                    text: 'Niveau de compétences avant de participer au programme de renforcement'
                }
            }
        }
    });


    var ctx = document.getElementById('myChart2').getContext('2d');
    var myChart2 = new Chart(ctx, {
        type: 'pie',
        data: {
            labels: ['Oui', 'Non', 'Moyennement'],
            datasets: [{
                label: 'Votes',
                data: [4, 0, 2],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            plugins: {
                title: {
                    display: true,
                    text: 'les attentes ont-elles ete satisfaite'
                }
            }
        }
    });


    var ctx = document.getElementById('myChart3').getContext('2d');
    var myChart3 = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ['Cours magistraux', 'Ateliers pratiques', 'Etudes de cas', 'Projets individuels ou en groupe',
                'Tutoriels en ligne', 'Jeux éducatifs', 'Séances de brainstorming', 'Débats et discussions',
                'Sessions de questions-réponses interactives', 'Présentations multimédias',
                'Utilisation de logiciels ou de plateformes d\'apprentissage en ligne', 'Exercices pratiques et simulations',
                'Accompagnement personnalisé', 'Études de terrain ou visites d\'entreprises',
                'Échanges d\'expériences et de bonnes pratiques entre participants'],
            datasets: [{
                label: 'Votes',
                data: [3, 5, 0, 3, 4, 0, 1, 3, 1, 0, 2, 3, 1, 0, 2],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(99,37,234,0.2)',
                    'rgba(221,37,248,0.2)',
                    'rgba(182,154,154,0.2)',
                    'rgba(10,52,50,0.2)',
                    'rgba(20,161,194,0.2)',
                    'rgba(89,241,51,0.2)',
                    'rgba(25,58,23,0.2)',
                    'rgba(2,241,169,0.2)',
                    'rgba(100,4,60,0.81)',
                    'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255, 99, 132, 1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(99,37,234,1)',
                    'rgba(221,37,248,1)',
                    'rgba(182,154,154,1)',
                    'rgba(10,52,50,1)',
                    'rgba(20,161,194,1)',
                    'rgba(89,241,51,1)',
                    'rgba(25,58,23,1)',
                    'rgba(2,241,169,1)',
                    'rgba(100,4,60,1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                y: {
                    beginAtZero: true,
                    ticks: {
                        fontFamily: 'Roboto' // Utilisation de la police de caractères
                    }
                },
                x: {
                    ticks: {
                        fontFamily: 'Roboto' // Utilisation de la police de caractères
                    }
                }
            }
        }
    });

});
