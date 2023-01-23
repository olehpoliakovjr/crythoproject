
document.addEventListener("DOMContentLoaded",function (){

    fetch("http://api.coinlayer.com/api/live?access_key=053e2d2db2dbf2699675eed1547bde38")

        .then(response => response.json())

        .then(data => {
            console.log(data)
            const rateBTC = data.rates.BTC;
            document.querySelector(".token1").innerHTML = `${rateBTC.toFixed(2)}$`;

            const rateBNB = data.rates.BNB;
            document.querySelector(".token2").innerHTML = `${rateBNB.toFixed(2)}$`;

            const rateETH = data.rates.ETH;
            document.querySelector(".token3").innerHTML = `${rateETH.toFixed(2)}$`;

            const rateADA = data.rates.ADA;
            document.querySelector(".token4").innerHTML = `${rateADA.toFixed(2)}$`;

            const rateIOST = data.rates.IOST;
            document.querySelector(".token5").innerHTML = `${rateIOST.toFixed(6)}$`;

        })

})