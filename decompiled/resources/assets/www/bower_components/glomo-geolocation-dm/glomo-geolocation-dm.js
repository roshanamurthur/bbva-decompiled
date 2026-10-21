/**
 `<glomo-geolocation-dm>` Description.

 Example:

 ```html
 <glomo-geolocation-dm></glomo-geolocation-dm>
 ```

 ## Styling
 The following custom properties and mixins are available for styling:

 ### Custom Properties
 | Custom Property     | Selector | CSS Property | Value       |
 | ------------------- | -------- | ------------ | ----------- |
 | --cells-fontDefault | :host    | font-family  |  sans-serif |
 ### @apply
 | Mixins    | Selector | Value |
 | --------- | -------- | ----- |
 | --glomo-geolocation-dm | :host    | {} |

 * @customElement glomo-geolocation-dm
 * @polymer
 * @extends {Polymer.Element}
 * @demo demo/index.html
 */

class GlomoGeolocationDm extends Polymer.mixinBehaviors([CellsBehaviors.CellsGlomoDmBehavior, CellsBehaviors.i18nBehavior, CellsBehaviors.CellsCheckNestedKeysBehavior], Polymer.Element) {
  static get is() {
    return 'glomo-geolocation-dm';
  }

  static get properties() {
    return {
      /**
       * Save if the consent is accepted or not
       * @type Boolean
       */
      consentAccepted: {
        type: Boolean,
        value: false
      },
      /**
       * Check if geolocation consent is saved in local storage
       * @type Boolean
       */
      localStorageConsent: {
        type: Boolean,
        value: false,
      },
      /**
       * Local storage key to save consent value data
       * @type String
       */
      _consentValueDataKey: {
        type: String,
        value: 'consent_value_data',
      },
      /**
       * Local storage key to save login data
       * @type String
       */
      _loginDataKey: {
        type: String,
        value: 'loginData'
      },
      /**
       * Flag to change texts in error modal
       * @type Boolean
       */
      changeDeniedModalText: {
        type: Boolean,
        value: false,
      },
      /**
       * Object for save device info: longitude, latitude and ip Address
       * @type Object
       */
      deviceLocation: {
        type: Object,
        value: () => ({}),
      },
      /**
       * save session id
       * @type String
       */
      sessionId: {
        type: String,
        value: '',
      },
      /**
       * Set customer id consent
       * @type String
       */
      customerId: {
        type: String,
        value: '',
      },
      /**
       * ClientId received of localStorage
       * @type String
       */
      clientId: {
        type: String,
        value: '',
      },
      /**
       * Check if the consent is saved
       * @type Boolean
       */
      consentIsSaved: {
        type: Boolean,
        value: false,
      },
      /**
       * Saves the response of the geolocation plugin, checking if the location is active or not
       * @type Object
       */
      localizationActive: {
        type: Object,
        value: () => ({}),
      },
      /**
       * Flag to check if the operating system is iOS
       * @type Boolean
       */
      isIOS: {
        type: Boolean,
        value: false,
      },
      /**
       * Public key to encrypt RSA
       * @type String
       */
      publicKey: {
        type: String,
        value: '',
      },
      /**
       * Counter to change texts in error modal when service fails
       * @type Object
       */
      triedCount: {
        type: Object,
        value: {
          counter: 0,
          max: 3,
        },
      },
      /**
       * Checks if visibility listener is changed
       * @type Boolean
       */
      _hasVisibilitychangeListener: {
        type: Boolean,
        value: false
      },
      /**
       * Default evidence type from geolocation
       * @type String
       */
      evidenceType: {
        type: String,
        value: 'EV-MX-AO-GEOLOC-001',
      },
      /**
       * Native request
       * @type Boolean
       */
      native: {
        type: Boolean,
        value: false
      },
      /**
       * Check if consent permission is granted
       * @type Boolean
       */
      permissionGranted: {
        type: Boolean,
        value: false
      },
      /**
       * Identifies if the permission status changes
       * @type String
       */
      stateChange: {
        type: String,
        value: '',
      },
      /**
       * Check if services are launched once
       * @type Boolean
       */
      serviceLaunched: {
        type: Boolean,
        value: false
      },
      /**
       * Url for see more information
       * @type {String}
       */
      moreInformation: {
        type: String,
        value: '',
      },
      /**
       * Url for detail of location
       * @type {String}
       */
      detailLocation: {
        type: String,
        value: '',
      },
      /**
       * Customer biocatch key
       */
      _customerBiocatch: {
        type: String,
        value: 'customerbiocatch'
      },
      /**
       * Flags settings
       */
      flagsKey: {
        type: String,
        value: 'glomo.login.geolocation'
      },
      /**
       * Flag to show geolocation modal
       */
      geolocationFlag: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to retry cipher
       * @type Number
       */
      _retryCipher: {
        type: Number,
        value: 0
      }
    };
  }

  /**
   * @dec Initialize values
   * @event viel-message
   * @event set-customer-id-consent
   * @event set-customer-id-consent
   */
  initPage() {
    if (this.geolocationFlag) {
      if (!this.serviceLaunched) {
        this.contentReset();
        this._dispatchEvents('viel-message', [
          'glomo-geolocation-ubication-spinner',
        ]);
        this._spinnerControl(true);
        this._dispatchEvents('set-customer-id-consent', this.customerId);
        this.getLocalStorage(this._consentValueDataKey, false);
      } else {
        this.continueProcess();
      }
    } else {
      this.continueProcess();
    }
  }

  /**
   * @desc Disables the spinner after the biometrics view is dismissed and proceeds with the app flow.
   * @event continue-app
   */
  continueProcess() {
    this._spinnerControl(false);
    this._dispatchEvents('continue-app', true);
  }

  /**
   * @desc Content reset
   * @event button-continue-privacy
   * @event set-initial-information
   * @event set-initial-header
   */
  contentReset() {
    this.triedCount.counter = 0;
    this._dispatchEvents('button-continue-privacy', false);
    this._dispatchEvents('set-initial-information', { hidden: true });
    this._dispatchEvents('set-initial-header', { titleName: '' });
  }

  /**
   * @desc Close global-alert-manager
   * @event close-modal
   */
  closeModal() {
    this._dispatchEvents('close-modal');
  }

  /**
   * @desc Consult variable in localStorage
   * @param {String} key
   * @event get-native-local-storage
   */
  getLocalStorage(key, secure = false) {
    this._dispatchEvents('get-native-local-storage', { key, secure });
  }

  /**
   * @desc Is executed when the variable is saved in the local storage
   * @param {Boolean} data
   */
  getStorageConsentDataSuccess(data) {
    this.localStorageConsent = data;
    if (this.native) {
      setTimeout(() => {
        this._checkStatePermission();
      }, 500);
    } else {
      this._leaveGeo();
    }
  }

  /**
  * Get and set flags properties from feature-flags
  * @param {Object} flags
  */
  getFeatureFlags(flags) {
    const flag = (flags && flags[`${this.flagsKey}`]) || {};
    this.geolocationFlag = (flag && flag.value) || false;
  }

  /**
   * @desc dispatch event to consult consent geo
   * @param {Object} data
   * @event consult-consent-geo
   */
  loginDataLocalStoreSuccess(data) {
    this.clientId = data.grantingTicketUserId;
    const queryParam = `operationCode%3D%3D${this.clientId}%20and%20evidenceTypeId%3D%3D${this.evidenceType}`;
    this._dispatchEvents('consult-consent-geo', queryParam);
  }


  /**
   * @desc See more information
   * @event glomo-geolocation-open-uri
   */
  seeMoreInformation() {
    let params = {
      scheme: this.moreInformation,
      packageId: null,
    };
    this._dispatchEvents('glomo-geolocation-open-uri', params);
  }

  /**
   * @desc Request location tips
   * @event request-location-tips
   */
  detailLocationLink() {
    let params = {
      scheme: this.detailLocation,
      packageId: null,
    };
    this._dispatchEvents('request-location-tips', params);
  }

  /**
   * @desc Is executed if request consult consent is success and evaluate if the permission exist
   * @param {Object} data
   */
  consentSuccess(data) {
    if (data) {
      this.set('consentIsSaved', !!data.find((dato) => dato.evidenceType.id === this.evidenceType));
    }
    if (this.consentIsSaved) {
      this._setConsentValueDataOnStorage();
      if (!this.permissionGranted) {
        this.verifyPermissionGeolocation();
      }
    } else {
      this.setInformationData();
      this._spinnerControl(this.permissionGranted);
    }
  }

  /**
   * @desc Throws event to set consent value data key on local storage
   */
  _setConsentValueDataOnStorage() {
    const dataStorage = {
      key: this._consentValueDataKey,
      value: this.isIOS ? String(this.consentIsSaved) : this.consentIsSaved
    };
    this._dispatchEvents('set-permission-accepted-on-local-storage', dataStorage);
  }

  /**
   * @desc If the request of the consult send error the app logout
   */
  consentError() {
    this.sendSignOff();
  }

  /**
   * @desc Set main information
   * @event set-title-name
   * @event set-initial-header
   * @event set-initial-information
   * @event button-continue-privacy
   */
  setInformationData() {
    this.resetServiceLaunched();
    this._dispatchEvents('set-title-name', 'glomo-geolocation-request-location-modal-title');
    const headerData = {
      titleName: 'glomo-geolocation-location-request',
      className: 'header--core-dark',
      hideLeftActions: true,
    };
    this._dispatchEvents('set-initial-header', headerData);
    const termnsData = {
      imageUrl: './images/geolocation/locate_world_dark.svg',
      titleText: this.t('glomo-geolocation-location-information-header'),
      text: this.t('glomo-geolocation-location-information-title'),
      linkText: this.t('glomo-geolocation-button-know-more'),
      hidden: false
    };
    this._dispatchEvents('set-initial-information', termnsData);

    const showTwoButtons = {
      config: {
        buttons: {
          primary: {
            class: 'primary',
            text: 'glomo-geolocation-principal-button',
          },
          secondary: {
            class: 'link',
            text: 'glomo-geolocation-button-privacy',
          },
        },
      },
      unfixed: true,
    };
    this._dispatchEvents('button-continue-privacy', showTwoButtons);
  }

  /**
   * @desc Verify if have consent permission
   */
  evaluateConsentSaved() {
    if (!this.consentIsSaved) {
      this.savePermission();
    } else {
      this.verifyPermissionGeolocation();
    }
  }

  /**
   * @desc Request to save permission
   * @event set-api-version-customer
   * @event save-permission
   */
  savePermission() {
    if (!this.consentIsSaved && !this.serviceLaunched) {
      const bodyPermission = [
        {
          termType: {
            id: 'EV-MX-AO-GEOLOC-001',
          },
          referenceNumber: 'PF',
          acceptanceMessages: [
            {
              value:
                'glomo-geolocation-permission-mesage',
            },
          ],
        },
      ];
      this.set('serviceLaunched', true);
      this._dispatchEvents('save-permission', bodyPermission);
    }
  }

  /**
   * @desc Consult the permission rejected
   * @param {String} state
   */
  _isPermissionsReject(state) {
    if (state === 'permanently_denied') {
      this.changeDeniedModalText = true;
    }
    this.set('consentIsSaved', this.localStorageConsent);
    this.geolocationPermissionRejected();
  }

  /**
   * @desc Consult plugin in native to detect permission of location
   */
  _checkStatePermission() {
    return new Promise((resolve) => {
      this.$.permissionsPlugin.checkState('location')
        .then(response => {
          const {
            state
          } = response;
          this.stateChange = state;
          const action = {
            'granted': this.isIOS ? 'geolocationCurrentPosition' : 'getPermissionLocationGps',
            'denied': '_isPermissionsReject',
            'permanently_denied': '_isPermissionsReject'
          };
          const actionState = action[state];
          if (actionState) {
            this.permissionGranted = state === 'granted';
            this[actionState](state);
          }
          resolve();
        });
    });
  }

  /**
   * @desc Verify permission
   */
  verifyPermissionGeolocation() {
    this.closeModal();
    if (this.isIOS) {
      this.getPermissionLocationGps();
    } else {
      this.getPermissionGeolocation();
    }
  }

  /**
   * @desc Save consent value key on local storage and get location permissions
   */
  savePermissionSuccess() {
    this._setConsentValueDataOnStorage();
    this.getPermissionGeolocation();
  }

  /**
   * @desc Verify if have permission if else request
   */
  getPermissionGeolocation() {
    this.contentReset();
    this.resetServiceLaunched();
    this._dispatchEvents('viel-message', [
      'glomo-geolocation-ubication-spinner',
    ]);
    this._spinnerControl(true);
    this.$.permissionsPlugin
      .request('location')
      .then(() => {
        this.permissionGranted = true;
        if (this.isIOS) {
          this.geolocationCurrentPosition();
        } else {
          this.getPermissionLocationGps();
        }
      })
      .catch(() => {
        this._checkStatePermission();
      });
  }

  /**
   * @desc Consult plugin in native for permission of gps
   */
  getPermissionLocationGps() {
    this._isLocationServiceEnabled()
      .then(() => {
        if (this.isIOS) {
          this.getPermissionGeolocation();
        } else {
          this.geolocationCurrentPosition();
        }
      })
      .catch(() => {
        if (this.isIOS) {
          this.activeLocalizationIOs();
        } else {
          this.activeLocalization();
        }
      });
  }

  /**
    * @desc Check if the location service is active
    */
  _isLocationServiceEnabled() {
    return new Promise((resolve, reject) => {
      this.$.geolocation.isLocationServiceEnabled()
        .then(response => {
          if (this.get('isLocationServiceEnabled', response)) {
            this.localizationActive = response;
            resolve();
          } else {
            reject(response);
            this.localizationActive = response;
            this.stateChange = 'gps';
          }
        })
        .catch(error => {
          reject(error);
        });
    });
  }

  /**
   * @desc Get device info from the user: longitude, latitude and ipAddress
   */
  async geolocationCurrentPosition() {
    const coordinates = await this._getCoordinates();
    const ipAddress = await this._getIpAddress();
    this.deviceLocation = {
      longitude: (coordinates).longitude,
      latitude: (coordinates).latitude,
      ipAddress: (ipAddress).ipAddressV4
    };
    await this.connectorCipher();
  }

  /**
   * @desc Method that get the device coordinates
   * @returns {Promise}
   */
  async _getCoordinates() {
    try {
      return await this.$.geolocation.getCurrentPosition();
    } catch (error) {
      if (error.code === 445) {
        this.modalTimeOut();
      }
    }
  }

  /**
   * @desc Method that get the device ip address
   * @returns {Promise}
   */
  async _getIpAddress() {
    try {
      return await this.$.deviceInfo.getNetworkType();
    } catch (error) {
      if (error.code === 445) {
        this.modalTimeOut();
      }
    }
  }

  /**
   * @desc Send a modal if the service fails
   * @event show-modal-signal-error
   */
  modalTimeOut() {
    const privacyModal = {
      code: this.triedCount.counter < this.triedCount.max ? 'trying-to-connect' : 'logout-app',
      selectedConfig: {
        className: 'full-height-error link-center',
        openMaximized: true,
        hideCloseIcon: true,
        title: 'glomo-geolocation-location-request',
        heroImage: './images/errors/error.svg',
        message: 'glomo-geolocation-modal-timeout-title',
        acceptBtLabel:
          this.triedCount.counter < this.triedCount.max ? 'glomo-geolocation-modal-timeout-accept-btn-retry' : 'glomo-geolocation-modal-timeout-accept-btn-leave',
        template: {
          type: 'paragraphs',
          values: [
            {
              text: this.triedCount.counter < this.triedCount.max ? 'glomo-geolocation-modal-timeout-text-one' : 'glomo-geolocation-modal-timeout-text-two',
              class: 'spacing',
            },
            {
              textMessage: 'glomo-geolocation-button-know-more',
              textMessageClass: 'text-message-paragraph',
              type: 'iconText',
              action: () => this.detailLocationLink()
            }
          ]
        }
      },
    };
    this._dispatchEvents('show-modal-signal-error');
    this._sendAlertManagerSettings(privacyModal);
    this.triedCount.counter++;
  }

  /**
   * @desc Create object to request tracking-data service
   * @event set-tracking-data-version
   * @event save-geolocation
   */
  saveGeolocation() {
    if (this.deviceLocation && !this.serviceLaunched) {
      const requestSaveGeolocation = {
        body: {
          geolocation: {
            latitude: this.deviceLocation.latitude,
            longitude: this.deviceLocation.longitude,
          },
          authentication: {
            id: 'fKLp8hTe7kO_Uz7fD1HHkg',
          },
          transaction: {
            id: 'J2A1',
          },
          enrollmentSetting: {
            enrollmentSettingType: {
              id: 'IP',
            },
            value: this.deviceLocation.ipAddress
          },
        },
        sessionId: this.sessionId,
      };
      this.set('serviceLaunched', true);
      this._dispatchEvents('save-geolocation', requestSaveGeolocation);
    }
  }

  /**
   * @desc Resets serviceLaunched property
   */
  resetServiceLaunched() {
    this.set('serviceLaunched', false);
  }

  /**
   * @desc If is Android send to configurations
   * @event open-device-permissions-settings-modal
   */
  activeLocalization() {
    if (this.permissionGranted) {
      this._dispatchEvents('open-device-permissions-settings-modal', { type: 'geolocation_service' });
      this.addVisibilitychangeListener();
    }
  }

  /**
   * @desc If the SO is IOS send modal
   * @event show-location-not-active-ios-modal
   */
  activeLocalizationIOs() {
    const modal = {
      code: 'location-not-active-ios',
      opened: true,
      selectedConfig: {
        className: 'full-height-error',
        openMaximized: true,
        hideCloseIcon: true,
        title: 'glomo-geolocation-location-request',
        heroImage: './images/geolocation/mobile_settings_dark.svg',
        message: 'glomo-geolocation-location-modal-message',
        acceptBtLabel: 'glomo-geolocation-permission-button-text-one',
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'glomo-geolocation-permission-rejected-text',
              class: 'spacing',
            },
            {
              text: 'glomo-geolocation-modal-ios-gps-steps',
            }
          ],
        },
      },
    };
    this._dispatchEvents('show-location-not-active-ios-modal');
    this._sendAlertManagerSettings(modal);
  }

  /**
   * @desc Send a modal if the user get off the location
   * @event show-geolocation-location-modal
   */
  geolocationPermissionRejected() {
    if (this.permissionGranted && !this.isIOS) {
      this.changeDeniedModalText = false;
    }

    const changeEvent = {
      denied: {
        eventModal: 'show-geolocation-location-modal',
      },
      permanently_denied: {
        eventModal: 'show-geolocation-location-modal',
      },
      gps: {
        eventModal: 'show-geolocation-location-modal-gps',
      },
    };

    const modal = {
      code: this.changeDeniedModalText ? 'geolocation-not-accepted' : 'geolocation-repeat-permission',
      opened: true,
      selectedConfig: {
        className: 'full-height-error',
        openMaximized: true,
        hideCloseIcon: true,
        title: 'glomo-geolocation-location-request',
        heroImage: './images/geolocation/mobile_settings_dark.svg',
        message: 'glomo-geolocation-location-message',
        acceptBtLabel: this.changeDeniedModalText ? 'glomo-geolocation-permission-button-text-one' : 'glomo-geolocation-permission-button-text-two',
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'glomo-geolocation-permission-rejected-text',
              class: 'spacing',
            }
          ],
        },
      },
    };
    this._dispatchEvents(this.c(changeEvent[this.stateChange], 'eventModal'));
    this._sendAlertManagerSettings(modal);
  }

  /**
   * @desc Send a event for firm modal button deny
   * @event firm-button-deny
   */
  modalFirmButtonDeny() {
    this._dispatchEvents('firm-button-deny');
    this.sendToConfigurations();
  }

  /**
   * @desc Is executed if request to save geolocation is success and set variable in localStorage
   */
  geolocationSuccess() {
    this.consentAccepted = true;
    this._setLocalStorageData();
  }

  /**
   * @desc Get session id from the user
   */
  async getSessionIdFromStorage() {
    const session = await this._getSessionId();
    this.sessionId = session.toLowerCase();
    this.saveGeolocation();
  }

  /**
   * @desc Method that get the session id from user
   * @returns {Promise}
   */
  async _getSessionId() {
    try {
      return await this.$.storage.getValue(this._customerBiocatch);
    } catch {
      this.sendSignOff();
    }
  }

  /**
   * @desc Send for a channel to native
   * @event go-to-configurations
   */
  sendToConfigurations() {
    const params = this.isIOS ? { setting: 'settings' } : { setting: 'location_source' };
    this.$.settings.openSetting(params).then(() => {
      this.addVisibilitychangeListener();
    });
  }

  /**
   * @desc Send for a channel to native gps settings
   */
  sendToGpsConfiguratons() {
    const params = { setting: 'settings' };
    this.$.settings.openSetting(params).then(() => {
      this.addVisibilitychangeListener();
    });
  }

  /**
   * @desc Adds document visibilitychange event listener
   */
  addVisibilitychangeListener() {
    if (!this._hasVisibilitychangeListener) {
      document.addEventListener('visibilitychange', this._visibilityChangeEventListener.bind(this));
      this._hasVisibilitychangeListener = true;
    }
  }

  /**
   * @desc Remove listener to know if the app visibility change
   */
  _removeVisibilityListener() {
    if (this._hasVisibilitychangeListener) {
      document.removeEventListener('visibilitychange', this._visibilityChangeEventListener);
      this._hasVisibilitychangeListener = false;
    }
  }

  /**
   * @desc Document visibilitychange event listener function
   */
  _visibilityChangeEventListener() {
    if (document.visibilityState === 'visible' && this._hasVisibilitychangeListener) {
      this._removeVisibilityListener();
      this.verifyPermissionGeolocation();
    }
  }

  /**
   * @desc Encrypt device info from the user
   */
  async connectorCipher() {
    const { longitude, latitude, ipAddress } = this.deviceLocation;
    this.deviceLocation.longitude = await this._cipherData(longitude);
    this.deviceLocation.latitude = await this._cipherData(latitude);
    this.deviceLocation.ipAddress = await this._cipherData(ipAddress);
    if (this.deviceLocation.longitude === 1 || this.deviceLocation.latitude === 1 || this.deviceLocation.ipAddress === 1) {
      this.modalTimeOut();
    } else {
      this.getSessionIdFromStorage();
    }
  }

  /**
   * @desc Method that encrypts the data
   * @param {String} data
   * @returns {Promise}
   */
  async _cipherData(dataNoCipher) {
    try {
      const dataCipher = {
        data: String(dataNoCipher),
        publicKey: this.publicKey,
        padding: 'PKCS1Padding'
      };
      return await this.$.cipherConnector.rsaEncrypt(dataCipher);
    } catch {
      if (this._retryCipher < 3) {
        this._retryCipher++;
        this._cipherData(dataNoCipher);
      } else {
        this._retryCipher = 0;
        return 1;
      }
    }
  }

  /**
   * @desc show privacy modal
   * @event privacy-geolocation
   */
  showModalPrivacy() {
    const privacitymModal = {
      code: 'geolocation-privacy',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'header--white assistance-identification-update',
        openMaximized: true,
        title: 'glomo-geolocation-button-privacy',
        message: '<hr/>',
        heroImage: './images/geolocation/BBVA.svg',
        acceptBtLabel: 'glomo-geolocation-modal-privacy-accept-btn',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-geolocation-notice-privacy'
            },
            {
              text: 'glomo-geolocation-notice-privacy-1',
              class: 'assistance-identification-update',
            },
            {
              text: 'glomo-geolocation-notice-privacy-2',
              class: 'assistance-identification-update',
            },
          ],
        },
      },
    };
    this._dispatchEvents('privacy-geolocation');
    this._sendAlertManagerSettings(privacitymModal);
  }

  /**
   * @desc Executed if the variable in localStorage not is setted
   */
  setStorageConsentDataError() {
    this.sendSignOff();
  }

  /**
   * @desc Executed if the variable in localStorage not is getted
   */
  getStorageConsentDataError() {
    if (this.isIOS) {
      this.getLocalStorage(this._loginDataKey, true);
    } else {
      this._dispatchEvents('consult-consent-geo', false);
    }
  }

  /**
   * @desc Send channel when the feature was completed
   */
  _leaveGeo() {
    this._spinnerControl(false);
    this.geolocationComplete();
  }

  /**
   * @desc Usen to notify at native the feature is completed
   * @event continue-app
   */
  geolocationComplete() {
    this.consentAccepted = true;
    this._dispatchEvents('continue-app', true);
  }

  /**
   * @desc Is used for set variable un localStorage
   * @event set-permission-accepted-on-local-storage
   */
  _setLocalStorageData() {
    let dataStorage = {
      key: this._consentValueDataKey,
      value: this.isIOS ? String(this.consentAccepted) : this.consentAccepted
    };
    this._dispatchEvents('set-permission-accepted-on-local-storage', dataStorage);
  }

  /**
   * @desc Notify native to logout
   * @event logout-geolocation
   */
  sendSignOff() {
    this._dispatchEvents('logout-geolocation');
  }

  /**
   * @desc control  spinner
   * @param {Boolean} control
   * @event show-spinner-text-evet
   * @event hide-spinner-text-evet
   */
  _spinnerControl(control) {
    if (control) {
      this.dataCustomSpinner = { variant: 'full', showSpinnerMessageLabel: true, loginAnimation: true };
      this._dispatchEvents('show-spinner-text-event', this.dataCustomSpinner);
    } else {
      this._dispatchEvents('hide-spinner-text-event');
    }
  }

  /**
   * Set public keys properties from public app settings
   * @param {Object}
   */
  setPublicKeys({geolocation = {}}) {
    const { urls = {}, publicKey = '' } = geolocation;
    this.moreInformation = urls.moreInformation || '';
    this.detailLocation = urls.detailLocation || '';
    this.publicKey = publicKey || '';
  }

  /**
   * Throws event with alert manager settings
   * @param {Object} config
   */
  _sendAlertManagerSettings(config) {
    this._dispatchEvents('send-alert-manager-settings', config);
  }

  /**
   * @desc Receive all disapatch events
   * @param {String} eventName
   * @param {Object} detail
   */
  _dispatchEvents(eventName, detail = {}) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detail
    })
    );
  }

}
customElements.define(GlomoGeolocationDm.is, GlomoGeolocationDm);
