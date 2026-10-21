/* global BGADPPois */
/* global moment */
/* eslint new-cap: 0 */
/**
 *
 * # &lt;cells-dm-global-apis-pois&gt;
 *
 * ![Certificated](https://img.shields.io/badge/certificated-yes-brightgreen.svg) ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
 *
 * [Demo of component in Cells Catalog](https://catalogs.platform.bbva.com/cells)
 *
 * DM to retrieve POIs from Global API
 *
 * Example:
 *
 * ```html
 * <cells-dm-global-apis-pois></cells-dm-global-apis-pois>
 * ```
 *
 * @summary DM to retrieve POIs from Global API.
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 * @hero dpcells.svg
 * @demo demo/index.html
 */
class CellsDmGlobalApisPois extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsGlobalApisHandleRequest,
  CellsBehaviors.CellsGlobalApisHandleRequestError,
  CellsBehaviors.CellsGlobalApisHandleRequestSign,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
  CellsBehaviors.CellsTextFormatterBehavior,
], Polymer.Element) {
  static get is() {
    return 'cells-dm-global-apis-pois';
  }
  static get properties() {
    return {
      /**
       * Host
       */
      host: String,
      /**
       * Services API Version
       */
      apiVersion: {
        type: String,
        value: '0'
      },
      /**
       * Current location
       */
      location: {
        type: Object,
        notify: true,
        value: {},
        observer: '_onLocationChanged'
      },
      place: {
        type: Object,
        observer: '_onPlaceLocation'
      },
      /**
       * Search value of finder
       */
      searchValue: {
        type: String,
        notify: true
      },
      /**
       * Pois list
       */
      pois: {
        type: Array,
        value: () => []
      },
      /**
       * Filter applied to the pois list
       */
      filter: {
        type: Array
      },
      /**
       * Filter applied to the pois list from notification
       */
      filterNotifications: {
        type: Object,
        value: () => ({})
      },
      /**
       * Pois id
       */
      poisId: String,
      /**
       * Pois type
       */
      type: {
        type: String,
        observer: '_typeObserver'
      },
      /**
       * Item selected in map
       */
      itemSelected: Object,
      /**
       * Params to set in the url to navigate
       */
      urlParams: Object,
      /**
       * Pois detail visited flag
       */
      poisDetailVisited: {
        type: Boolean,
        value: false
      },
      /**
       * Filtered pois
       */
      closestPois: {
        type: Array,
        value: () => []
      },
      /**
       * Filtered Branches. Used for cache
       */
      filteredBranches: {
        type: Array,
        value: () => []
      },
      /**
       * Filtered ATMs. Used for cache
       */
      filteredAtms: {
        type: Array,
        value: () => []
      },
      /**
       * Hide timetable information for branches
       */
      hideBranchTimetable: {
        type: Boolean,
        value: false
      },
      /**
       * Native request
       */
      native: {
        type: Boolean,
        value: false
      },
      /**
       * True if modal is open
       */
      openedModal: {
        type: Boolean,
        value: false
      },
      /**
       * Request require tsec
       */
      requiresTsec: {
        type: Boolean,
        value: false
      },
      /**
       * requiredToken, 'jwt' or 'tsec' or empty
       */
      requiredToken: {
        type: String,
        value: 'tsec'
      },
      /**
       * Return formated address
       */
      fullAddress: {
        type: Boolean,
        value: false
      },
      /**
       * Return formated address for detail
       */
      fullAddressDetail: {
        type: Boolean,
        value: false
      },
      /**
       * Hide icon list
       */
      hideIconList: {
        type: Boolean,
        value: false
      },
      /**
       * List button label
       */
      listButtonLabel: {
        type: String,
        value: 'cells-collapsible-list-route'
      },
      /**
       * List button label Digital Appointment
       */
      listButtonLabelDigitalAppointment: {
        type: String,
        value: 'cells-collapsible-list-digital-appointment'
      },
      /**
       * Waiting time label
       */
      waitingTimeLabel: {
        type: String,
        value: 'glomo-atm-locator-check-waiting-time'
      },
      /**
       * Full address main prefix
       */
      fullAddressMainPrefix: {
        type: String,
        value: 'branch-locator-cells-collapsible-list-branch-title'
      },
      /**
       * Pois operations
       */
      poisOperations: {
        type: Array,
        value: [
          {
            label: 'Compartir',
            id: 'share',
            icon: 'coronita:share'
          },
          {
            label: 'Pedir Turno',
            id: 'turn',
            icon: 'coronita:turnbox'
          },
          {
            label: 'Ruta',
            id: 'route',
            icon: 'coronita:walkingdirections'
          }
        ]
      },
      /**
       * Default config of pois types
       */
      poisTypes: {
        type: Object,
        value: () => ({
          branch: {
            name: 'cells-atm-locator-branch-name',
            header: 'cells-atm-locator-branch-header',
            description: 'cells-atm-branch-detail-branch-default-description',
            waitTime: 'cells-atm-branch-detail-branch-estimated-waiting-time',
            closestPoisTitle: 'cells-atm-branch-detail-branch-closest-pois-title',
            service: '_serviceBranchDetail',
            poisService: '_serviceBranches',
            param: 'branch-id',
            params: {}
          },
          atm: {
            name: 'cells-atm-locator-atm-name',
            header: 'cells-atm-locator-atm-header',
            description: 'cells-atm-branch-detail-atm-default-description',
            waitTime: '',
            closestPoisTitle: 'cells-atm-branch-detail-atm-closest-pois-title',
            service: '_serviceAtmDetail',
            poisService: '_serviceAtms',
            param: 'atm-id',
            params: {'type.id': 'DP&type.id=PC'}
          },
          agent: {
            name: 'cells-atm-locator-agent-name',
            header: 'cells-atm-locator-agent-header',
            description: 'cells-atm-branch-detail-atm-default-description',
            waitTime: '',
            closestPoisTitle: 'cells-atm-branch-detail-agent-closest-pois-title',
            service: '_serviceAtmDetail',
            poisService: '_serviceAtms',
            param: 'atm-id',
            params: {'type.id': 'KI'}
          }
        })
      },
      /**
       * Current session tsec
       */
      token: String,
      /**
       * If the login anonymous error has been initialized
       */
      isAnonymousLoginError: {
        type: Boolean,
        value: false
      },
      /**
       * Show/Hide the schedule for the weekend
       */
      withOutWeekendSchedule: {
        type: Boolean,
        value: false
      },
      /**
       * Show more info in detail or not
       */
      showMoreInfo: {
        type: Boolean,
        value: false
      },
      /**
       * To call a service and show only branches
       */
      onlyBranches: {
        type: Boolean,
        value: false
      },
      /**
       * Change the format of the schedule
       */
      formatSchedule: {
        type: Boolean,
        value: false
      },
      /**
       * Time format to change
       */
      momentInitialFormat: {
        type: String,
        value: 'HH:mm:ss'
      },
      /**
       * Desired format
       */
      momentFormat: {
        type: String,
        value: 'HH:mm'
      },
      /**
       * Hide type and access ATM info
       */
      hideAtmInfo: {
        type: Boolean,
        value: false
      },
      /**
       * Show digital appointment icon
       */
      showDigitalAppointment: {
        type: Boolean,
        value: false
      },
      /**
       * Not validate if user is logged in field has digital appointment
       */
      notValidateUserLoggedInDigitalAppointment: {
        type: Boolean,
        value: false
      },
      /**
       * Get Poi Detail without pois closest
       */
      getPoiDetailRaw: {
        type: Boolean,
        value: false
      },
      /**
       * Add poi in list link
       */
      addPoiInLinkList: {
        type: Boolean,
        value: false
      },
      /**
       * Remove null info from poi
       */
      removeNullInfoFromPoi: {
        type: Boolean,
        value: false
      },
      /**
       * Add atms in branch
       */
      addAtmsInBranch: {
        type: Boolean,
        value: false
      },
      /**
       * Add nearby branch or atm
       */
      addNearbyBranchOrAtms: {
        type: Boolean,
        value: false
      },
      /**
       * Disable filter by geolocation in near atms
       */
      notFilterByGeolocationNearbyAtms: {
        type: Boolean,
        value: false
      },
      /**
       * Size of list of nearest branches or atms
       */
      listSizeNearestBranchOrAtm: {
        type: Number,
        value: 2
      },
      /**
       * Types of atms
       */
      atmTypes: {
        type: Object,
        value: () => ({
          DP: {
            type: 'atm',
            class: 'secondary'
          },
          PC: {
            type: 'atm',
            class: 'secondary'
          },
          KI: {
            type: 'agent',
            class: 'tertiary'
          }
        })
      },
      /**
       * Filter repeated atms
       */
      filterRepeatingAtms: {
        type: Object,
        value: false
      },
      /**
       * Array of all listed branches
       */
      allBranches: {
        type: Array,
        value: () => []
      },
      /**
       * Enable capitalize of pois info
       */
      camelizePoi: {
        type: Boolean,
        value: false
      },
      /**
       * Min length that should be capitalize
       */
      camelizeMinLenght: {
        type: Number,
        value: 3
      },
      /**
       * Show estimated waiting time in list of branches or atms
       */
      showWaitingTimeInfoInList: {
        type: Boolean,
        value: false
      },
      /**
       * Enable tranlation in full address
       */
      enableTranslateFullAddress: {
        type: Boolean,
        value: false
      },
      /**
       * Enable estimated waiting time label in clostest pois list
       */
      enableWaitingTimeClosest: {
        type: Boolean,
        value: false
      },
      /**
       * Enable estimated waiting time in poi detail
       */
      enableWaitTimeLabel: {
        type: Boolean,
        value: false
      },
      /**
       * Enable banches filter
       */
      filterPois: {
        type: Boolean,
        value: false
      },
      /**
       * Allows to obtain the id of the links to send it in the closestPois
       */
      enableLinkId: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to enable decrypted id in listBranches Service
       */
      decryptedIdEstimated: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to enable encrypted id in listBranches Service
       */
      encryptedIdEstimated: {
        type: Boolean,
        value: false
      },
      /**
       * Feature Flag and OpenWeb Flag to enable consumption of pois services in akamai
       */
      featureFlagPois: {
        type: Boolean,
        value: false
      },
      /**
       * Alternate host to consume pois services
       */
      alternateHost: {
        type: String,
        value: ''
      },
      /**
       * Flag to know minior account
       */
      isGlomoMiniorAccount: {
        type: Boolean,
        value: false
      },
      /**
       * Cgs Api key
       */
      cgsApiKey: {
        type: String,
        value: ''
      }
    };
  }

  /**
    * Array of strings describing multi-property observer methods and their
    * dependant properties
    */
  static get observers() {
    return [
      'filterMarkers(pois, filter)'
    ];
  }

  init(params) {
    if (this.token || !this.requiresTsec) {
      this.getPois(params);
    }
  }
  /**
   * Config header for services .
   *
   * @method configHeaderWithKey
   * @param {Object} headers
   */
  _configHeaderWithKey(header = {}) {
    if (this.cgsApiKey.length > 0) {
      return {
        ...header,
        'x-api-key': this.cgsApiKey,
        ...this.headers || {}
      };
    }
    return {
      ...header,
      ...this.headers || {}
    };
  }
  /**
   * Set continue and url params
   * @return boolean
   */
  setContinueWithParams(params) {
    if (params) {
      const poiDistance = this.featureFlagPois ? { distance: params.distance } : {};
      this.urlParams = Object.assign(poiDistance, params.urlParams);
      this.poisDetailVisited = true;
    }
  }

  /**
   * Control navigation from map to pois detail
   * @return boolean
   */
  controlNavigationToPoisDetail() {
    if (this.poisDetailVisited) {
      const poiDistance = this.featureFlagPois ? { distance: this.urlParams.distance } : {};
      setTimeout(() => {
        this.dispatchEvent(new CustomEvent('navigation-to-pois-detail', {
          detail: Object.assign(poiDistance, { poisId: this.urlParams.poisId, type: this.urlParams.type }),
          bubbles: true,
          composed: true
        }));
      }, 250);
      this.poisDetailVisited = false;
    }
  }

  /**
   * Handle de native back button event
   */
  handleNativeBackButton(backNavigation) {
    if (backNavigation && backNavigation.value && backNavigation.value.cancelledNavigation.currentPage === 'atmLocator') {
      if (this.openedModal) {
        this.dispatchEvent(new CustomEvent('navigate-native-back-button', {
          bubbles: true,
          composed: true
        }));
      } else {
        this.dispatchEvent(new CustomEvent('navigate-to-previous-page', {
          bubbles: true,
          composed: true
        }));
      }
    }
  }

  _onPlaceLocation(place) {
    if (place && place.latLng && place.latLng.lat && place.latLng.lng) {
      this.location = {
        latitude: place.latLng.lat,
        longitude: place.latLng.lng
      };
      this.searchValue = place.search;
      this.getPois(this.location);
      this.dispatchEvent(new CustomEvent('set-location', {
        bubbles: true,
        composed: true,
        detail: this.location
      }));
    }
  }

  /**
   * Reset search value property to empty string
   */
  clearSearchValue() {
    this.searchValue = '';
  }

  /**
   * Set filter from notification and launch event with array to check
   */
  setFilterNotification(filterNotifications) {
    let filterId = this.c(filterNotifications, 'filter', '');
    this.filter =  [ filterId ];
    return this.dispatchEvent(new CustomEvent('send-filter-array', {
      bubbles: true,
      composed: true,
      detail: this.filter
    }));
  }

  /**
    * Filter the current pois with the options and notify the result
    */
  filterMarkers(pois, filters) {
    let currentPois = pois;
    if (Array.isArray(filters)) {
      currentPois = pois.filter(poi => (filters).includes(poi.type));
    }

    this._notifyPois(currentPois);
  }

  /**
   * Does the request to retrieve the POIs
   */
  getPois(params = {}) {
    this._openSpinner(true);
    if (this.isGlomoMiniorAccount) {
      this.showDigitalAppointment = false;
    }
    const searchLocation = {
      latitude: this.get('latitude', params) || this.get('latitude', this.location),
      longitude: this.get('longitude', params) || this.get('longitude', this.location)
    };
    const servers = this._getPoisServersConfiguration(this.type, searchLocation);
    this.set('location', searchLocation);
    Promise.all(
      servers.map((server) => {
        return server.generateRequest();
      })
    ).then(() => {
      let allResponses = [];
      servers.forEach((server) => {
        const lastResponse = this._parseResponse(server.getLastResponse());
        if (lastResponse) {
          if (this.camelizePoi) {
            this._camelizePoi(lastResponse);
          }
          allResponses = [...allResponses, ...lastResponse];
        }
      });
      this._successResponse(allResponses);
    }).catch((e) => {
      this._generateErrorFireEventHandler('error-on-get-pois')(e);
      this._openSpinner(false);
    });
  }

  /**
   * Anonymous/private tsec handler
   * @param {String} tokenInfo
   */
  handleToken(tokenInfo = {}) {
    const tsec = this.get('token', tokenInfo);
    this.requiresTsec = !this.requiresTsec && this.featureFlagPois ? this.requiresTsec : !!tsec;
    if (tsec) {
      window.sessionStorage.setItem('tsec', tsec);
      this._openSpinner(false);
      this.initComponents();
    }
  }

  /**
   * Reset components and start location when tsec token
   */
  start() {
    this.token = window.sessionStorage.getItem('tsec');
    if (!this.requiresTsec || this.token) {
      this.initComponents();
    } else {
      this._openSpinner(true);
    }
  }

  /**
   * Handler method when anonymous login error
   */
  handleAnonymousLoginError() {
    if (!this.isAnonymousLoginError) {
      this._openSpinner(false);
      this.dispatchEvent(new CustomEvent('atm-locator-hide-component', {
        bubbles: true,
        composed: true,
        detail: true
      }));
      this.dispatchEvent(new CustomEvent('atm-locator-show-component', {
        bubbles: true,
        composed: true,
        detail: false
      }));
      this.dispatchEvent(new CustomEvent('resize', {
        bubbles: true,
        composed: true,
        detail: this
      }));
      this.isAnonymousLoginError = true;
    }
  }

  /**
   * Show default components and start location
   */
  initComponents() {
    this._resetComponents();
    this.dispatchEvent(new CustomEvent('atm-locator-start-location'));
  }

  /**
   * Reset method when init page
   */
  reset() {
    if (this.token || !this.requiresTsec) {
      this._resetComponents();
      this._resetPois();
      this.onlyBranches = false;
      this.filterPois = false;
    }
  }

  /**
   * Reset components to default
   */
  _resetComponents() {
    this.dispatchEvent(new CustomEvent('atm-locator-reset-hide-component', {
      bubbles: true,
      composed: true,
      detail: true
    }));
    this.dispatchEvent(new CustomEvent('atm-locator-reset-show-component', {
      bubbles: true,
      composed: true,
      detail: false
    }));
    this.dispatchEvent(new CustomEvent('atm-locator-reset-show-branch', {
      bubbles: true,
      composed: true,
      detail: this.filterPois ? true : false
    }));
    this.dispatchEvent(new CustomEvent('resize', {
      bubbles: true,
      composed: true,
      detail: {}
    }));
  }

  /**
   * Reset map pois
   */
  _resetPois() {
    this.dispatchEvent(new CustomEvent('set-pois-list', {
      bubbles: true,
      composed: true,
      detail: []
    }));
  }

  /**
   * Generates the request params
   */
  _generateParams(params) {
    let result = params;
    if (params.radius) {
      result.radius = params.radius;
    }
    return result;
  }

  /**
   * Handles successful response
   */
  _successResponse(data) {
    this.isAnonymousLoginError = false;
    let pois = this.onlyBranches ? this._parsePoisBranch(data) : this._parsePois(data);
    this.set('pois', pois);
    if (Array.isArray(this.filter)) {
      pois = pois.filter(poi => this.filter.includes(poi.type));
    }
    this._notifyPois(pois);
  }

  /**
   * Notify the pois list passed as param.
   */
  _notifyPois(pois) {
    this.dispatchEvent(new CustomEvent('set-pois-list', {
      detail: pois,
      bubbles: true,
      composed: true
    }));
    this._openSpinner(false);
  }

  /**
   * Configure servers for each POIs
   * @param {Object} params
   */
  _getPoisServersConfiguration(poisType, params = {}) {
    const keysPoisTypes = poisType ? [ poisType ] : Object.keys(this.poisTypes);
    const servers = keysPoisTypes.map((key) => {
      const serverParams = Object.assign({}, params, this.poisTypes[key].params);
      const sortParams = this.featureFlagPois ? this._sortParams(serverParams) : null;
      if (this.featureFlagPois) {
        this.host = this.alternateHost;
        this.requiresTsec = false;
        this.native = false;
      }
      const poiServer = this[this.poisTypes[key].poisService]({
        host: this.host,
        params: sortParams || serverParams,
        version: this.apiVersion,
        requiresTsec: this.requiresTsec,
        native: this.native,
        headers: this._configHeaderWithKey()
      });
      if (this.requiresTsec || this.requiredToken) {
        poiServer.requiredToken = this.requiredToken;
      }
      return poiServer;
    });
    return servers;
  }

  /**
   * Parses all ATMs and branches received from the server
   */
  _parsePois(data) {
    const userIsLogged = this.notValidateUserLoggedInDigitalAppointment ? true : this._userIsLogged();
    return ((this.filterRepeatingAtms ? this.getData(data) : data) || []).map(item => {
      const {showDigitalAppointment, type, extraClass, fullAddress, secondary, tertiary, related} = this._preParsePois({data, item, userIsLogged});
      const operations = showDigitalAppointment ? this.poisOperations : [this.poisOperations[0], this.poisOperations[2]];
      if (this.featureFlagPois) {
        this.addPoiInLinkList = item.id.length === 4 ? false : true;
      }
      return {
        id: item.id,
        address: item.address,
        fullAddress: fullAddress,
        description: this.fullAddress ? `${this.t(this.fullAddressMainPrefix)} ${item.description}` : item.description,
        geolocation: item.address.geolocation,
        distance: item.distance,
        type,
        related: related,
        extraClass: extraClass,
        hasDigitalAppointment: showDigitalAppointment,
        main: this.fullAddress ? `${this.t(this.fullAddressMainPrefix)} ${item.description}` : item.description,
        secondary: secondary,
        tertiary: tertiary,
        iconList: this.hideIconList ? '' : 'coronita:walkingdirections',
        iconListDigitalAppointment: this.isGlomoMiniorAccount ? '' :  'coronita:turnbox',
        iconSize: 24,
        textIcon: this.t(this.listButtonLabel),
        textIconDigitalAppointment: this.isGlomoMiniorAccount ? '' :  this.t(this.listButtonLabelDigitalAppointment),
        links: [...(this.addPoiInLinkList ? [ { id: item.id, type } ] : []), ...(Array.isArray(item.links) ? item.links : [])],
        operations: operations
      };
    });
  }

  /**
   * Prepare pois info to be parsed
   * @param {Array} data
   * @param {Object} item
   * @param {Boolean} userIsLogged
   */
  _preParsePois({data, item, userIsLogged}) {
    const hasOnlineAppointment = this._hasOnlineAppointment(item.availableServices);
    const showDigitalAppointment = this.showDigitalAppointment && hasOnlineAppointment && userIsLogged;
    const keyPoi = (this.get('type.id', item) || this.get('atmType.id', item) || '').toUpperCase();
    const isAtm = keyPoi in this.atmTypes;
    const type = isAtm ? this.atmTypes[keyPoi].type : 'branch';
    const extraClass = isAtm ? this.atmTypes[keyPoi].class : 'primary';
    const numberOfAtms = item.type === 'ATM' ? this._getNumberOfAtms(data, item) : 0;
    const nameSet = this._getPoiDetailName(numberOfAtms, type);
    const fullAddress = this._getFullAddress(item.address);
    const secondary = this.fullAddress ? fullAddress : this._getPoisDistance(item, isAtm, nameSet);
    const tertiary = this.showWaitingTimeInfoInList && type === 'branch' ? this.t(this.waitingTimeLabel, '') : undefined;
    const related = item.links.map(link => {
      return {
        id: link.id,
        type: link.rel
      };
    });
    return {showDigitalAppointment, type, extraClass, fullAddress, secondary, tertiary, related};
  }

  /**
   * Get number of atms
   * @param {Array} pois
   * @param {Object} linkedBranch
   */
  _getNumberOfAtms(pois, linkedBranch) {
    const linkedBranchId = linkedBranch.links.find(item => item.rel === 'BRANCH').id;
    let atms = pois.filter(item => item.type === 'ATM' && this.get('id', item.links.find(link => link.rel === 'BRANCH')) === linkedBranchId);
    if (!this.notFilterByGeolocationNearbyAtms) {
      const linkedBranchLatitude = this.get('address.geolocation.latitude', linkedBranch);
      const linkedBranchLongitude = this.get('address.geolocation.longitude', linkedBranch);
      atms = atms.filter(item => this.get('address.geolocation.latitude', item) === linkedBranchLatitude && this.get('address.geolocation.longitude', item) === linkedBranchLongitude);
    }
    return atms.length;
  }

  /**
   * Control pois operations to set header in operation icon
   */
  _branchOperations(operations) {
    return this.filterPois ? [
      {
        label: 'cells-atm-branch-detail-select-branch-operation',
        id: 'branch',
        icon: 'coronita:branch'
      }
    ] : operations;
  }

  /**
     * Control the pois links
     */
  _branchLinks(item, type) {
    return this.isGlomoMiniorAccount ? '' : this.filterPois ? [...[ { id: item.id, type } ], ...(Array.isArray(item.links) ? item.links : [])] : item.links;
  }

  /**
     * Control pois operations icon in collapsible list and branch detail
     */
  _branchIconList() {
    return this.filterPois ? 'coronita:branch' : 'coronita:walkingdirections';
  }

  /**
   * Parses all ATMs and branches received from the server
   */
  _parsePoisBranch(data) {
    const userIsLogged = this.notValidateUserLoggedInDigitalAppointment ? true : this._userIsLogged();
    const branches =  [];
    data.map(item => {
      if (item.type === 'BRANCH') {
        branches.push(item);
      }
    });
    const branchesDataFilter = this.filterPois ? branches : data;
    return (branchesDataFilter || []).map(item => {
      const hasOnlineAppointment = this._hasOnlineAppointment(item.availableServices);
      const showDigitalAppointment = this.showDigitalAppointment && hasOnlineAppointment && userIsLogged;
      const type = this.type;
      const extraClass = 'primary';
      const nameSet = this.t(this.poisTypes[type].name, '');
      const secondary = this.fullAddress ? this._getFullAddress(item.address) : this._getPoisDistance(item, false, nameSet);
      const related = item.links.map(link => {
        return {
          id: link.id,
          type: link.rel
        };
      });
      const operations = showDigitalAppointment ? this.poisOperations : [this.poisOperations[0], this.poisOperations[2]];
      return {
        id: item.id,
        address: item.address,
        description: this.fullAddress ? `${this.t(this.fullAddressMainPrefix)} ${item.description}` : item.description,
        geolocation: item.address.geolocation,
        distance: item.distance.toFixed(0),
        type,
        related: related,
        extraClass: extraClass,
        hasDigitalAppointment: showDigitalAppointment,
        main: this.fullAddress ? `${this.t(this.fullAddressMainPrefix)} ${item.description}` : item.description,
        secondary: secondary,
        iconList: this.hideIconList ? '' : this._branchIconList(),
        iconListDigitalAppointment: this.filterPois ? '' : 'coronita:turnbox',
        iconSize: 24,
        textIcon: this.filterPois ? 'cells-atm-branch-detail-select-branch-operation' : this.t(this.listButtonLabel),
        textIconDigitalAppointment: this.filterPois ? '' : this.t(this.listButtonLabelDigitalAppointment),
        links: this._branchLinks(item, type),
        operations: this._branchOperations(operations),
      };
    });
  }

  /**
   * Control pois type to set header in pois detail
   */
  _typeObserver() {
    const poiType = this.t((this.poisTypes[this.type] || {}).header, '');
    const headerTitle = this.t('cells-atm-locator-pois-detail-header', '', {poiType});
    this.dispatchEvent(new CustomEvent('set-pois-type', {
      bubbles: true,
      composed: true,
      detail: headerTitle
    }));
  }

  /**
   * Get atm or branch detail
   */
  getPoiDetail(params) {
    let poiDetail = this.poisTypes[this.type];

    if (this.featureFlagPois) {
      this.host = this.alternateHost;
      this.requiresTsec = false;
      this.native = false;
    }

    if (this.itemSelected.type !== undefined && this.itemSelected.info?.provider !== undefined) {
      if (this.itemSelected.type === 'branch' && this.itemSelected.info?.provider === 'ACF') {
        setTimeout(() => {
          this.dispatchEvent(new CustomEvent('get-branch-estimated-time-detail-provider', {
            bubbles: true,
            composed: true,
            detail: {
              'branch.id': this.itemSelected.info.id,
            }
          }));
        }, 200);
      }
    }

    const service = this[poiDetail.service]({
      host: this.host,
      params: Object.assign({[poiDetail.param]: this.poisId}, params),
      version: this.apiVersion,
      requiresTsec: this.requiresTsec,
      native: this.native,
      headers: this._configHeaderWithKey()
    });

    if (this.requiresTsec) {
      service.requiredToken = this.requiredToken;
    } else if (this.requiredToken) {
      service.requiredToken = this.requiredToken;
    }

    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      if (response && this.camelizePoi) {
        this._camelizePoi(response);
      }
      this.dispatchEvent(new CustomEvent('set-pois-details', {
        bubbles: true,
        composed: true,
        detail: response
      }));
      if (!this.getPoiDetailRaw) {
        this._getClosestPois(response);
      }
    }, this._generateErrorFireEventHandler('error-on-get-pois-detail'));
  }

  /**
   * Capitalize pois address and description
   * @param {*} poi
   */
  _camelizePoi(poi) {
    const details = Array.isArray(poi) ? poi : [ poi ];
    details.forEach(detail => {
      detail.description = this.camelize(detail.description, this.camelizeMinLenght, ' ', true, false, true);
      const address = detail.address;
      for (const property in address) {
        if (typeof address[property] === 'string') {
          address[property] = this.camelize(address[property], this.camelizeMinLenght, ' ', true, false, true);
        } else if (typeof this.get(`${property}.name`, address) === 'string') {
          address[property].name = this.camelize(address[property].name, this.camelizeMinLenght, ' ', true, false, true);
        } else if (Array.isArray(this.get(`${property}`, address))) {
          address[property].forEach(item => {
            if (typeof item.name === 'string') {
              item.name = this.camelize(item.name, this.camelizeMinLenght, ' ', true, false, true);
            }
          });
        }
      }
    });
  }

  /**
   * Request poi estimated waiting time
   * @param {Object} poi
   * @param {Array} closestPois
   * @param {Array} fullClosestPois
   * @event pois-detail-estimated-time
   */
  _estimatedWaitingTime(poi, closestPois, fullClosestPois) {
    let params;
    let paramUnmasked;

    const requestEstimatedTime = (branchId, unmasked) => {
      params = {
        branchId
      };
      if (typeof unmasked === 'boolean') {
        Object.assign(params, { unmasked });
      }
      this.dispatchEvent(new CustomEvent('pois-detail-estimated-time', {
        bubbles: true,
        composed: true,
        detail: {
          params
        }
      }));
    };
    if (this.encryptedIdEstimated && !this.featureFlagPois) {
      poi.id = this.poisId;
    }
    this.allBranches = [poi, ...closestPois];

    if (this.featureFlagPois && this.decryptedIdEstimated) {
      fullClosestPois.forEach(el => {
        paramUnmasked = el.id.length === 4 ? true : false;
        requestEstimatedTime(el.id, paramUnmasked);
      });
    } else {
      this.allBranches.forEach(item => requestEstimatedTime(item.id));
    }
  }

  /**
   * Set poi estimated waiting time
   * @param {Object} response
   * @returns
   */
  setEstimatedWaitingTime(response) {
    if (response === null) {
      return;
    }
    const estimatedTime = ('branches' in response) ? response.branches[0].bank.branch : response[0].branch;
    const index = this.allBranches.findIndex(item => item.id === estimatedTime.id || item.id.includes(estimatedTime.id));
    if (index === 0) {
      this.allBranches[index].estimatedWaitingTime = ('branches' in response) ? response.branches[0].estimatedWaitingTime : response[0].estimatedWaitingTime;
    } else {
      const waitTime = response.branches[0].estimatedWaitingTime;
      this.allBranches[index].estimatedWaitingTime = waitTime;
      this.allBranches[index].waitTime = waitTime && `${this.t(this.poisTypes.branch.waitTime, '', { waitTime })}`;
    }

    let poi = this.allBranches[0];
    let closestPois = [ ...this.allBranches ].splice(1, 3).map(item => {
      const newItem = {...item};
      delete newItem.estimatedWaitingTime;
      return newItem;
    });
    this.set('closestPois', closestPois);
    this.dispatchEvent(new CustomEvent('set-poi-detail', {
      bubbles: true,
      composed: true,
      detail: this._parsePoiDetail(poi)
    }));
  }
  /**
   * Public function to get closest atms or branches
   */
  getClosestPois(poi) {
    this._getClosestPois(poi);
  }

  /**
   * Get closest atms or branches
   */
  _getClosestPois(poi) {
    let closestPois = [];
    const poisType = this.poisTypes[this.type];
    const latLong = {
      latitude: this.c(poi, 'address.geolocation.latitude') || this.c(poi, 'geolocation.latitude'),
      longitude: this.c(poi, 'address.geolocation.longitude') || this.c(poi, 'geolocation.longitude')
    };
    const params = Object.assign({}, latLong, poisType.params);
    const sortParams = this.featureFlagPois ? this._sortParams(params) : null;
    const serviceToCall = poisType.poisService;
    if (this.featureFlagPois) {
      this.host = this.alternateHost;
      this.requiresTsec = false;
      this.native = false;
    }
    const service = this[serviceToCall]({
      host: this.host,
      params: sortParams || params,
      version: this.apiVersion,
      requiresTsec: this.requiresTsec,
      native: this.native,
      headers: this._configHeaderWithKey()
    });

    if (this.requiresTsec) {
      service.requiredToken = this.requiredToken;
    } else if (this.requiredToken) {
      service.requiredToken = this.requiredToken;
    }
    service.generateRequest().then(() => {
      closestPois = Object.assign([], this._parseResponse(service.getLastResponse()));
      if (closestPois && this.camelizePoi) {
        this._camelizePoi(closestPois);
      }
      if (this.type === 'branch') {
        if (this.addAtmsInBranch) {
          poi.atmsInBranch = this.get('0.atmsInBranch', closestPois);
        }
        if (this.addAvailableServices) {
          poi.availableServices = this.get('0.availableServices', closestPois);
        }
      }
      if (this.addNearbyBranchOrAtms) {
        poi.numberOfAtms = this.type === 'atm' ? this._getNumberOfAtms(closestPois, poi) : undefined;
        closestPois = this._filterClosestPois(closestPois).map(item => {
          return {
            id: item.id,
            description: this.get('address.addressName', item),
            distance: item.distance,
            estimatedWaitingTime: this.enableWaitTimeLabel && this.type === 'branch' ? this.t('cells-atm-branch-detail-branch-calculate-waiting-time', '') : '',
            links: this.buildLinks(item),
            address: { geolocation: this.get('address.geolocation', item) },
            numberOfAtms: this.type === 'atm' ? this._getNumberOfAtms(closestPois, item) : undefined
          };
        });
      }
      this.set('closestPois', this._parseClosestPois(closestPois.slice(1, 1 + this.listSizeNearestBranchOrAtm)));
      this.dispatchEvent(new CustomEvent('set-poi-detail', {
        bubbles: true,
        composed: true,
        detail: this.getPoiDetailRaw ? closestPois : this._parsePoiDetail(poi)
      }));
      if (this.enableWaitingTimeClosest && this.type === 'branch') {
        this._estimatedWaitingTime(poi, this.closestPois, closestPois.slice(0, 1 + this.listSizeNearestBranchOrAtm));
      }
    }, this._generateErrorFireEventHandler('error-on-get-closest-pois'));
  }

  buildLinks(item) {
    const linkId = this.featureFlagPois && this.enableLinkId ? this.get('links.0.id', item) : item.id;
    return this.type === 'atm' ? [{ id: linkId }, { id: this.get('links.1.id', item) }] : [ { id: linkId } ];
  }

  /**
   * Filter closest pois
   * @param {Array} closestPois
   * @return Branch or atm closest pois
   */
  _filterClosestPois(closestPois) {
    return this.type === 'branch' ? this._getBranches(closestPois) : this._getAtms(closestPois);
  }

  /**
   * Get branches
   * @param {Object} pois
   * @returns List of only branches
   */
  _getBranches(pois) {
    const result =  pois.filter(item => item.type === 'BRANCH');
    return result;
  }

  /**
   * Get atms
   * @param {Object} pois
   * @returns List of anly atms
   */
  _getAtms(pois) {
    return pois.filter((item, index) => item.type === 'ATM' && pois.findIndex(element => this.get('links.1.id', element) === this.get('links.1.id', item)) === index);
  }
  /**
   * Parse closest pois
   */
  _parseClosestPois(pois) {
    return pois.map(item => {
      const nameSet = this._getPoiDetailName(item.numberOfAtms);
      const isAtm = this.type === 'atm';
      return {
        key: item.description,
        value: this._getPoisDistance(item, isAtm, nameSet),
        waitTime: item.estimatedWaitingTime || '',
        id: item.links[0].id,
        type: this.type,
        distance: Math.trunc(item.distance),
        geolocation: item.address.geolocation
      };
    });
  }

  /**
   * Translates if number of atms is more than 1
   * @param {Number} numberOfAtms
   * @param {String} type
   * @returns Locale to be translated
   */
  _getPoiDetailName(numberOfAtms, type) {
    return `${numberOfAtms > 1 ? `${numberOfAtms} ` : ''}${this.t(`${this.poisTypes[type || this.type].name}${numberOfAtms > 1 ? '-plural' : ''}`, '')}`;
  }
  /**
     * Control the pois appointment operation
     */
  _hasDigitalAppointmentDetail(data) {
    if (this.filterPois) {
      this.dispatchEvent(new CustomEvent('set-select-branch-operations', {
        bubbles: true,
        composed: true,
        detail: [
          {
            label: 'cells-atm-branch-detail-select-branch-operation',
            id: 'branch',
            icon: 'coronita:branch'
          }
        ]
      }));
      return false;
    } else {
      return data;
    }
  }

  /**
   * Parse atm/branch detail
   */
  _parsePoiDetail(poi) {
    const poiDetail = this.poisTypes[this.type];
    const userIsLogged = this.notValidateUserLoggedInDigitalAppointment ? true : this._userIsLogged();
    const hasOnlineAppointment = this._hasOnlineAppointment(poi.availableServices);
    const showDigitalAppointment = this.showDigitalAppointment && hasOnlineAppointment && userIsLogged;
    const nameSet = this._getPoiDetailName(poi.numberOfAtms);
    const isAtm = this.type === 'atm';
    const waitTime = poi.estimatedWaitingTime;
    const getWaitTime = () => poi.estimatedWaitingTime ? `${this.t(this.poisTypes.branch.waitTime, '', { waitTime })}` : this.t('cells-atm-branch-detail-branch-calculate-waiting-time', '');
    const item = {...poi, distance: this.itemSelected ? this.itemSelected.distance : ''};
    return {
      id: poi.id,
      geolocation: poi.address.geolocation,
      description: poi.description || this.t(poiDetail.description, ''),
      distance: this.itemSelected ? this._getPoisDistance(item, isAtm, nameSet)  : '',
      type: this.type,
      hasDigitalAppointment: this._hasDigitalAppointmentDetail(showDigitalAppointment),
      info: this._getPoiInfo(poi, this.type),
      ...this.itemSelected ? { itemSelected: this.itemSelected } : {},
      closestPois: {
        title: poiDetail.closestPoisTitle,
        pois: this.closestPois
      },
      waitTime: this.enableWaitTimeLabel && this.type === 'branch' ? getWaitTime() : undefined,
      telephone: poi.telephone && this._checkNumber(poi.telephone)
    };
  }

  /**
   * Return atm/branch info
   */
  _getPoiInfo(poi, type) {
    let info = [];
    if (poi) {
      info.push({
        key: 'cells-atm-branch-detail-address',
        value: (this.fullAddressDetail && poi.address) ? this._getFullAddress(poi.address) : poi.address.addressName
      });
      if (type === 'branch' && !this.hideBranchTimetable) {

        info.push(...this._poiInfo(poi));

      } else if (type === 'atm' && !this.hideAtmInfo) {
        info.push(
          {
            key: 'cells-atm-branch-atm-type',
            value: poi.type.id === 'DP' ? this.t('cells-atm-branch-atm-withdrawal-type') : this.t('cells-atm-branch-atm-deposit-type')
          },
          {
            key: 'cells-atm-branch-atm-access-type',
            value: poi.scope === 'PUBLIC' ? this.t('cells-atm-branch-atm-public-access') : this.t('cells-atm-branch-atm-private-access')
          }
        );
      }
    }
    return info;
  }
  /**
  * Cheks if phone has spaces and removes it
  */
  _checkNumber(contactNumber) {
    if (contactNumber.includes(' ')) {
      contactNumber = contactNumber.replace(/\s+/g, '');
    }
    return contactNumber;
  }
  /**
   * Return info to push
   */
  _poiInfo(poi) {
    const withMoreInfo = [{
      key: 'cells-atm-branch-detail-telephone',
      value: poi.telephone
    },
    {
      key: 'cells-atm-branch-detail-timetable',
      value: poi.openingHours && this._getTimetable(poi.openingHours)
    },
    {
      key: 'cells-atm-branch-detail-branch-number',
      value: poi.id
    },
    {
      key: 'cells-atm-branch-detail-info',
      value: poi.atmsInBranch && this._getAtmsInside(poi.atmsInBranch)
    }];
    const withLessInfo = [{
      key: 'cells-atm-branch-detail-timetable',
      value: poi.openingHours && this._getTimetable(poi.openingHours)
    },
    {
      key: 'cells-atm-branch-detail-info',
      value: poi.atmsInBranch && this._getAtmsInside(poi.atmsInBranch)
    }];
    const infoToPush = this.showMoreInfo ? withMoreInfo : withLessInfo;
    return this.removeNullInfoFromPoi ? infoToPush.filter(item => item.value !== undefined) : infoToPush;
  }

  /**
   * Return timetable grouping by opening hours
   */
  _getTimetable(schedule) {
    let groups = [];

    this._fillDays(schedule);

    schedule.forEach((item, index) => {
      if (item.from === this._getLastItem(groups).from && item.to === this._getLastItem(groups).to) {
        this._getLastItem(groups).itemsIndex.push((this._getLastItem(groups).itemsIndex) + 1);
        this._getLastItem(groups).lastDay = item.dayOfWeek.toLowerCase();
      } else {
        groups.push({
          firstDay: item.dayOfWeek.toLowerCase(),
          from: item.from,
          to: item.to,
          itemsIndex: [ 0 ]
        });
      }
    });

    return this._translateTimeTable(groups);
  }

  /**
   * Fill schedule with empty days for closed days
  */
  _fillDays(schedule) {
    let week = ['MONDAY', 'TUESDAY', 'WEDNESDAY', 'THURSDAY', 'FRIDAY', 'SATURDAY', 'SUNDAY'];
    let days = [];

    schedule.forEach(day => {
      days.push(day.dayOfWeek);
    });
    week.forEach((day, index) => {
      if (!days.includes(day)) {
        schedule.splice(index, 0, { dayOfWeek: day });
      }
    });
  }

  /**
   * Get the last item of an array
   */
  _getLastItem(array) {
    return array[(array.length) - 1] ? array[(array.length) - 1] : {};
  }

  /**
   * Translate days of timetable
   */
  _translateTimeTable(groups) {
    let timetable = '';
    const listTimetable = [];
    groups.forEach(group => {
      const groupItem = group;
      const time = group.itemsIndex.length > 1 ? 'period' : 'day';
      const translateKey = `cells-atm-branch-detail-timetable-${time}${group.from ? '' : '-closed'}`;
      if (group.from) {
        this.timetableWithFromTo(translateKey, groupItem, listTimetable, timetable);
      } else {
        this.timetableWithoutFromTo(translateKey, groupItem, listTimetable, timetable);
      }
    });

    return listTimetable;
  }
  timetableWithFromTo(translateKey, group, listTimetable, timetable) {
    return listTimetable.push(timetable += this.t(translateKey, '', {
      firstDay: this.t('cells-atm-branch-detail-timetable-' + group.firstDay),
      lastDay: group.itemsIndex.length > 1 ? this.t('cells-atm-branch-detail-timetable-' + group.lastDay) : undefined,
      from: this.formatSchedule ? moment(group.from, this.momentInitialFormat).format(this.momentFormat) : group.from,
      to: this.formatSchedule ? moment(group.to, this.momentInitialFormat).format(this.momentFormat) : group.to
    }));
  }
  timetableWithoutFromTo(translateKey, group, listTimetable, timetable) {
    if (!this.withOutWeekendSchedule) {
      return listTimetable.push(timetable += this.t(translateKey, '', {
        firstDay: this.t('cells-atm-branch-detail-timetable-' + group.firstDay),
        lastDay: this.t('cells-atm-branch-detail-timetable-' + group.lastDay)
      }));
    } else if (group.itemsIndex.length === 0) {
      return listTimetable.push(timetable += this.t(translateKey, '', {
        firstDay: this.t('cells-atm-branch-detail-timetable-' + group.firstDay)
      }));
    }
  }

  /**
   * Returns atms in a branch and its type
   */
  _getAtmsInside(atms) {
    let message = '';
    let countSpecialAtms = 0;
    let countAtms = 0;
    let atmsMessage = '';
    let pcAtmsMessage = '';
    let key = '';
    atms.forEach(atm => {
      if (atm.id === 'PC' || atm.id === 'AB') {
        countSpecialAtms += atm.number;
      } else {
        countAtms += atm.number;
      }
    });
    if (countAtms > 0) {
      key = countAtms !== 1 ? 'cells-atm-branch-detail-atm' : 'cells-atm-branch-detail-atm-singular';
      atmsMessage = this.t(key, '', {atmNumber: countAtms});
      message = atmsMessage;
    }
    if (countSpecialAtms > 0) {
      key = countSpecialAtms !== 1 ? 'cells-atm-branch-detail-atm-pc' : 'cells-atm-branch-detail-atm-pc-singular';
      pcAtmsMessage = this.t(key, '', {atmNumber: countSpecialAtms});
      message = pcAtmsMessage;
    }
    if (countAtms > 0 && countSpecialAtms > 0) {
      message = atmsMessage + ' y ' + pcAtmsMessage;
    }
    return message;
  }

  /**
   * Function that opens and closes spinner
   * @param {Boolean} ValueOpen
   */
  _openSpinner(ValueOpen) {
    const flagOpen = ValueOpen;
    const eventSend = flagOpen ? 'open-control-veil' : 'close-control-veil';
    this.dispatchEvent(new CustomEvent(eventSend, {
      bubbles: true,
      composed: true,
      detail: true
    }));
  }


  /**
   * Location property observer
   */
  _onLocationChanged(locationObserver) {
    this.set('filteredBranches', []);
    this.set('filteredAtms', []);
  }

  /**
   * Return a distance pois object
   */
  _getPoisDistance(address, isAtm, nameValue) {
    const adressValue = address;
    const nameSet = nameValue;
    const branches = Array.isArray(adressValue.links) && adressValue.links.reduce((acc, link) => {
      if (link.rel === 'ATM') {
        acc++;
      }
      return acc;
    }, 0);
    return this.t('cells-atm-locator-pois-distance', '', {
      nameSet,
      number: (branches > 1) ? branches : '',
      distance: Math.trunc(adressValue.distance)
    });
  }

  /**
   * Return a full address
   */
  _getFullAddress(address) {
    if (!address) {
      return;
    }
    const { addressName = '', geographicGroups = [], city = '', country = {}, state = {}, zipCode = ''} = address;
    const section = geographicGroups.find(group => this.get('geographicGroupType.id', group) === 'COLONY') || {};
    const countryName = country ? country.name : '';
    return this.enableTranslateFullAddress ? [
      this.t('cells-atm-branch-detail-full-address', '', {
        addressName: addressName.replace(/\d+/g, function(match) {
          return `#${match}`;
        }),
        city: city,
        colony: this.c(section, 'name', ''),
        zipCode: zipCode,
        state: this.c(state, 'name', '')
      }) ] : [addressName, `${this.c(section, 'name', '')} ${city}, ${countryName}`];
  }

  /**
   *
   * @param {Object} payload
   * @event success-on-get-list-branches
   * @event error-on-get-list-branches
   */
  getListBranches(payload = {}) {
    const params = payload.params || {};
    const poisType = this.poisTypes.branch;
    const serviceToCall = poisType.poisService;
    const service = this[serviceToCall]({
      host: this.host,
      params: Object.assign({}, params),
      version: this.apiVersion,
      requiresTsec: this.requiresTsec,
      native: this.native,
      headers: this._configHeaderWithKey()
    });

    if (this.requiresTsec || this.requiredToken) {
      service.requiredToken = this.requiredToken;
    }

    service.generateRequest()
      .then(() => {
        const response = this._parseResponse(service.getLastResponse());
        this._parseBranches(response);
        this.dispatchEvent(new CustomEvent('success-on-get-list-branches', {
          bubbles: true,
          composed: true,
          detail: response
        }));
      }, this._generateErrorFireEventHandler('error-on-get-list-branches'));
  }

  /**
   * Service Atms
   * /pois/v0/atms
   */
  _serviceAtms(config) {
    return new BGADPPois.atms.get(config);
  }

  /**
  * Service Bank Pois
  * /pois/v0/bank-pois
  */
  _serviceBankPois(config) {
    return new BGADPPois.bankPois.get(config);
  }

  /**
   * Service Pois Atm Detail
   * /pois/v0/atms/{atmId}
   */
  _serviceAtmDetail(config) {
    return new BGADPPois.atms.atm.get(config);
  }

  /**
   * Service Branches
   * /pois/v0/branches
   */
  _serviceBranches(config) {
    return new BGADPPois.branches.get(config);
  }

  /**
   * Service Pois Branch Detail
   * /pois/v0/branches/{branchId}
   */
  _serviceBranchDetail(config) {
    return new BGADPPois.branches.branch.get(config);
  }

  /**
   * Returns true when user is logged
   */
  _userIsLogged() {
    return /^true$/.test(window.sessionStorage.getItem('isLogged'));
  }

  /**
   * Returns true when availableServices has id === ONLINE_APPOINTMENT
   */
  _hasOnlineAppointment(item) {
    return item ? item.findIndex(services => services.id === 'ONLINE_APPOINTMENT') > -1 : false;
  }

  /**
   * @description Get list branches from pois based on latitud and longitud in params
   * @param {*} params
   */
  getBranches(params) {
    this._openSpinner(true);
    this.set('location', {
      latitude: this.c(params, 'latitude', 0),
      longitude: this.c(params, 'longitude', 0)
    });
    const payload = {
      params: this.location
    };
    this.getListBranches(payload);
    this._openSpinner(false);
  }

  /**
   * @description Get list branches from pois based on latitud and longitud in params
   * @param {*} params
   */
  getBankPois(params) {
    const service = this._serviceBankPois({
      host: this.host,
      params: Object.assign({}, params),
      version: this.apiVersion,
      requiresTsec: this.requiresTsec,
      native: this.native,
      headers: this._configHeaderWithKey()
    });
    if (this.requiresTsec || this.requiredToken) {
      service.requiredToken = this.requiredToken;
    }
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('success-on-get-bank-pois', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-bank-pois'));
  }

  /**
   * @description Parse info obtained by pois service and dispatch event with it
   * @param {*} branches
   * @event set-searched-branches-list
   */
  _parseBranches(branches) {
    let newData = (branches || []).map(item => {
      const related = item.links.map(link => {
        return {
          id: link.id,
          type: link.rel
        };
      });
      return {
        id: item.id,
        address: item.address,
        description: item.description,
        geolocation: item.address.geolocation,
        distance: item.distance,
        type: 'branch',
        related: related,
        extraClass: 'primary',
        main: item.description,
        secondary: this._getFullAddress(item.address),
        tertiary: `Sucursal a ${item.distance}m`,
        iconSize: 24,
        textIcon: 'branch-locator-cells-collapsible-list-button',
        links: item.links,
        operations: [
          {
            label: 'branch-locator-glomo-atm-locator-item-selected-button-label',
            id: 'share'
          }
        ]
      };
    });
    this.dispatchEvent(new CustomEvent('set-searched-branches-list', {
      bubbles: true,
      composed: true,
      detail: newData
    }));
  }

  /**
   * @description Get place location and list branches based on coordinates
   * @param {*} response
   * @event set-searched-place-location
   * @event set-search-place-value
   */
  getPlaceLocation(response) {
    this._openSpinner(true);
    const lat = this.c(response, 'latLng.lat') === 0 ? this.location.latitude : this.c(response, 'latLng.lat');
    const lng = this.c(response, 'latLng.lng') === 0 ? this.location.longitude : this.c(response, 'latLng.lng');
    const searchPlace = this.c(response, 'search', '');
    const coordinates = {
      latitude: lat,
      longitude: lng
    };
    this.getListBranches({ params: coordinates });
    this.dispatchEvent(new CustomEvent('set-searched-place-location', {
      bubbles: true,
      composed: true,
      detail: coordinates
    }));
    this.dispatchEvent(new CustomEvent('set-search-place-value', {
      bubbles: true,
      composed: true,
      detail: searchPlace
    }));
    this.set('location', coordinates);
    this._openSpinner(false);
  }

  /**
   * Filters repeated atms
   * @param {*} data
   * @returns {Object}
   */
  getData(data) {
    return data.filter((item, index) => item.type === 'BRANCH' || data.findIndex(element =>
      this.get('address.geolocation.latitude', element) === this.get('address.geolocation.latitude', item) &&
      this.get('address.geolocation.longitude', element) === this.get('address.geolocation.longitude', item)) === index);
  }

  /**
   * Order the parameters to consume the service in akamai
   * @param {Object} params
   * @returns {Object}
   */
  _sortParams(params) {
    const sortObjParams = {};
    const paramKeys = Object.keys(params);
    paramKeys.sort();
    paramKeys.forEach(key => {
      sortObjParams[key] = params[key];
    });
    return sortObjParams;
  }

}
window.customElements.define(CellsDmGlobalApisPois.is, CellsDmGlobalApisPois);
