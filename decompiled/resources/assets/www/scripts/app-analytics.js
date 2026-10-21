(function (document) {
  'use strict';

  const appConfig = window.AppConfig;
  function loadAnalyticsManager(cb) {
    var script = document.createElement('script');
    script.onload = cb || null;
    script.src = `${appConfig.componentsPath}cells-analytics-collector/dist/cells-adobe-launch-collector.${appConfig.environment === 'pro' ? 'min.' : ''}js`;
    script.async = 1;
    document.head.appendChild(script);
  }
  const getLang = localLang => {
    if (localLang && typeof localLang === 'string') {
      return localLang.split('-')[0].toUpperCase();
    }
  };
  function initAnalytics() {
    // eslint-disable-next-line no-unused-vars
    window.analyticsCollector = new window.AdobeLaunchCollector({
      mainNode: appConfig.mainNode,
      dataLayerName: 'digitalData',
      dataLayer: {
        versionDL: '20190718_4.0',
        pageInstanceID: appConfig.environment,
        page: {
          pageInfo: {
            pageName: '',
            pageIntent: '',
            pageSegment: '',
            sysEnv: appConfig.sysEnv,
            version: appConfig.appVersion,
            channel: 'online',
            language: getLang(appConfig.lang),
            geoRegion: '',
            level1: '',
            level2: '',
            level3: '',
            level4: '',
            level5: '',
            level6: '',
            level7: '',
            level8: '',
            level9: '',
            level10: '',
            area: '',
            server: '',
            businessUnit: appConfig.businessUnit,
            siteAppName: appConfig.siteAppName,
            projectName: '',
            errorPage: ''
          },
          pageActivity: {
            search: {
              onSiteSearchResults: '',
              onSiteSearchTerm: '',
              onSiteSearchEnterTerm: ''
            },
            link: {
              name: '',
              url: '',
              ext: '',
              aux1: '',
              aux2: '',
              aux3: ''
            },
            video: {
              nameOfVideoDisplayed: ''
            },
            audio: {
              nameOfPodcastDisplayed: ''
            },
            loginType: ''
          }
        },
        optimization: {
          attributes: [{
            idOptimization: '',
            experience: '',
            place: '',
            type: '',
            executor: '',
            audience: ''
          }],
          event: {
            eventName: '',
            optimizationEvent: ''
          }
        },
        internalCampaign: {
          attributes: [{
            location: '',
            campaignFormat: '',
            collectiveCode: '',
            campaignName: '',
            product: '',
            productCode: '',
            quantity: ''
          }],
          event: {
            eventInfo: {
              eventName: '',
              siteActionName: ''
            }
          }
        },
        user: {
          device: {
            userAgent: '',
            mobile: '',
            root: ''
          },
          userState: '',
          profileID: '',
          userID: '',
          prospectID: '',
          segment: {
            global: appConfig.userSegmentGlobal,
            profile: ''
          },
          gender: '',
          country: '',
          state: '',
          age: '',
          civilStatus: '',
          educationLevel: '',
          jobType: ''
        },
        application: {
          transactionID: '',
          application: {
            type: '',
            name: ''
          },
          fulfillmentModel: '',
          typology: '',
          programTypeHired: '',
          offer: '',
          operationNumber: '',
          process: '',
          step: '',
          interactionLevel: '',
          isQualifiedVisits: '',
          state: '',
          errorType: '',
          earnings: '',
          expenses: '',
          customFields: '',
          globalApplication: ''
        },
        products: {
          attributes: [{
            primaryCategory: '',
            productSubtype: '',
            productName: '',
            productCode: '',
            quantity: '',
            amount: '',
            paymentAmount: '',
            numberOfPayments: '',
            paymentDate: '',
            paymentType: '',
            serviceCharge: '',
            currency: '',
            numberOfHolders: '',
            interestRate: {
              tin: '',
              tae: '',
              rate: ''
            },
            term: '',
            group: '',
            state: ''
          }, {
            primaryCategory: '',
            productSubtype: '',
            productName: '',
            productCode: '',
            quantity: '',
            amount: '',
            paymentAmount: '',
            numberOfPayments: '',
            paymentDate: '',
            paymentType: '',
            serviceCharge: '',
            currency: '',
            numberOfHolders: '',
            interestRate: {
              tin: '',
              tae: '',
              rate: ''
            },
            term: '',
            group: '',
            state: ''
          }],
          productPortfolio: [{
            productName: '',
            balance: '',
            currency: '',
            productCode: ''
          }]
        }
      }
    });
  }
  loadAnalyticsManager(initAnalytics);
})(document);